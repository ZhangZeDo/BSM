package com.hltj.provider.serviceImpl;

import com.hltj.api.dao.TLuckyInfoMapper;
import com.hltj.api.domain.TCustomer;
import com.hltj.api.domain.TLuckyInfo;
import com.hltj.api.domain.TStockInfo;
import com.hltj.api.dto.LuckyInfoDTO;
import com.hltj.api.dto.PageResponseResult;
import com.hltj.api.exception.BussException;
import com.hltj.api.service.CustomerService;
import com.hltj.api.service.LuckyInfoService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zhangzedong
 * @version 1.0
 * @date 2021/3/28 10:12
 */
@Service("luckyInfoService")
public class LuckyInfoServiceImpl implements LuckyInfoService {
    private Logger logger = LoggerFactory.getLogger(LuckyInfoServiceImpl.class);

    @Resource
    private TLuckyInfoMapper luckyInfoDao;
    @Resource
    private CustomerService customerService;

    @Override
    public void insertLuckyInfo(LuckyInfoDTO luckyInfoDTO, String operator) {
        String openId = luckyInfoDTO.getOpenId();
        if (StringUtils.isBlank(openId)){
            throw new BussException("用户微信openid为空，插入失败");
        }
        TCustomer customer = customerService.queryCustomerByOpenID(openId);
        TLuckyInfo luckyInfo = new TLuckyInfo();
        BeanUtils.copyProperties(luckyInfoDTO,luckyInfo);
        luckyInfo.setCustomerId(customer.getCustomerId());
        luckyInfo.setCreatedBy(operator);
        luckyInfo.setUpdatedBy(operator);
        luckyInfoDao.insertSelective(luckyInfo);
    }

    @Override
    public PageResponseResult queryLuckyInfoListByDTO(LuckyInfoDTO luckyInfoDTO) {
        Integer page = luckyInfoDTO.getPage();
        if (luckyInfoDTO.getPage() == null || luckyInfoDTO.getPageSize() == null) {
            throw new BussException("非法入参");
        }
        if (page > 0) {
            luckyInfoDTO.setStartNum((page - 1) * luckyInfoDTO.getPageSize());
        } else {
            luckyInfoDTO.setStartNum(0);
        }

        List<LuckyInfoDTO> luckyInfoDTOList = luckyInfoDao.selectByLuckyInfoDTO(luckyInfoDTO);
        int total = luckyInfoDao.selectTotalByLuckyInfoDTO(luckyInfoDTO);
        return new PageResponseResult(total, luckyInfoDTOList);
    }
}
