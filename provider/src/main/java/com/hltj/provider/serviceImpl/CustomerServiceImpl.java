package com.hltj.provider.serviceImpl;

import cn.hutool.core.collection.CollectionUtil;
import com.hltj.api.dao.TCustomerMapper;
import com.hltj.api.domain.TCustomer;
import com.hltj.api.domain.TCustomerExample;
import com.hltj.api.dto.CustomerDTO;
import com.hltj.api.dto.PageResponseResult;
import com.hltj.api.enums.TableId;
import com.hltj.api.exception.BussException;
import com.hltj.api.service.CustomerService;
import com.hltj.api.service.SequenceService;
import com.hltj.provider.utils.UniqIdUtil;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author zhangzedong
 * @version 1.0
 * @date 2021/2/28 10:29
 */
@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
    private Logger logger = LoggerFactory.getLogger(CustomerServiceImpl.class);

    @Resource
    private TCustomerMapper customerDao;
    @Resource
    private SequenceService sequenceService;

    @Override
    public PageResponseResult queryCustomerList(CustomerDTO customerDTO) {
        Integer page = customerDTO.getPage();
        if (customerDTO.getPage() == null || customerDTO.getPageSize() == null) {
            throw new BussException("非法入参");
        }
        if (page > 0) {
            customerDTO.setStartNum((page - 1) * customerDTO.getPageSize());
        } else {
            customerDTO.setStartNum(0);
        }

        if (StringUtils.isEmpty(customerDTO.getSort())){
            customerDTO.setSort("create_datetime desc");
        }

        List<TCustomer> customerList = customerDao.selectByCustomerDTO(customerDTO);
        int total = customerDao.selectTotalByCustomerDTO(customerDTO);
        return new PageResponseResult(total, customerList);
    }

    @Override
    public void insertCustomerInfo(TCustomer customer, String operator) {
        if (StringUtils.isEmpty(customer.getOpenId())){
            throw new BussException("未获取到客户微信开放ID");
        }
        TCustomer customerDB = queryCustomerByOpenID(customer.getOpenId());
        if (customerDB == null){
            customer.setId(UniqIdUtil.getUniqId());
            customer.setCustomerId(sequenceService.getBussId(TableId.ID_T_CUSTOMER.getCode(),"C"));
            resetCustomer(customer,operator);
            customerDao.insertSelective(customer);
        }
        logger.info("当前客户信息已录入，不再重复操作");
    }

    @Override
    public TCustomer queryCustomerByOpenID(String openId){
        TCustomerExample example = new TCustomerExample();
        example.createCriteria().andOpenIdEqualTo(openId);
        List<TCustomer> customerList = customerDao.selectByExample(example);
        if (CollectionUtil.isEmpty(customerList)){
            return null;
        }
        return customerList.get(0);
    }

    private void resetCustomer(TCustomer customer, String operator){
        Date date = new Date();
        if (StringUtils.isBlank(customer.getCreatedBy())){
            customer.setCreateDatetime(date);
            customer.setCreatedBy(operator);
        }
        customer.setUpdatedBy(operator);
        customer.setUpdateDatetime(date);
    }
}
