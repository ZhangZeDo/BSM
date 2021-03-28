package com.hltj.provider.serviceImpl;

import com.hltj.api.dao.TBuyOutInfoMapper;
import com.hltj.api.domain.TBuyOutInfo;
import com.hltj.api.domain.TCustomer;
import com.hltj.api.domain.TStockInfo;
import com.hltj.api.dto.BuyOutInfoDTO;
import com.hltj.api.dto.LuckyInfoDTO;
import com.hltj.api.dto.PageResponseResult;
import com.hltj.api.exception.BussException;
import com.hltj.api.service.BuyOutInfoService;
import com.hltj.api.service.CustomerService;
import com.hltj.api.service.StockInfoService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author zhangzedong
 * @version 1.0
 * @date 2021/3/28 10:13
 */
@Service("buyOutInfoService")
public class BuyOutInfoServiceImpl implements BuyOutInfoService {
    private Logger logger = LoggerFactory.getLogger(BuyOutInfoServiceImpl.class);

    @Resource
    private TBuyOutInfoMapper buyOutInfoDao;
    @Resource
    private CustomerService customerService;
    @Resource
    private StockInfoService stockInfoService;

    @Override
    public void insertBuyOutInfo(BuyOutInfoDTO buyOutInfoDTO, String operator) {
        String openId = buyOutInfoDTO.getOpenId();
        if (StringUtils.isBlank(openId)){
            throw new BussException("用户微信openid为空，插入失败");
        }
        String stockCode = buyOutInfoDTO.getStockCode();
        if (StringUtils.isBlank(stockCode)){
            throw new BussException("股票代码为空，插入失败");
        }
        TBuyOutInfo buyOutInfo = new TBuyOutInfo();
        BeanUtils.copyProperties(buyOutInfoDTO,buyOutInfo);

        //设置用户id
        TCustomer customer = customerService.queryCustomerByOpenID(openId);
        buyOutInfo.setCustomerId(customer.getCustomerId());

        //计算卖出收益
        TStockInfo stockInfo = stockInfoService.queryStockInfoByStockCode(stockCode);
        BigDecimal buyOutProfit = new BigDecimal(buyOutInfo.getBuyOutNumber()).multiply(stockInfo.getHeap()).multiply(buyOutInfo.getBuyOutPrice().subtract(stockInfo.getIssuePrice()));
        buyOutInfo.setBuyOutProfit(buyOutProfit.setScale(2));

        buyOutInfo.setCreatedBy(operator);
        buyOutInfo.setUpdatedBy(operator);
        buyOutInfoDao.insertSelective(buyOutInfo);
    }

    @Override
    public PageResponseResult queryBuyOutInfoListByDTO(BuyOutInfoDTO buyOutInfoDTO) {
        Integer page = buyOutInfoDTO.getPage();
        if (buyOutInfoDTO.getPage() == null || buyOutInfoDTO.getPageSize() == null) {
            throw new BussException("非法入参");
        }
        if (page > 0) {
            buyOutInfoDTO.setStartNum((page - 1) * buyOutInfoDTO.getPageSize());
        } else {
            buyOutInfoDTO.setStartNum(0);
        }

        List<BuyOutInfoDTO> luckyInfoDTOList = buyOutInfoDao.selectByBuyOutInfoDTO(buyOutInfoDTO);
        int total = buyOutInfoDao.selectTotalByBuyOutInfoDTO(buyOutInfoDTO);
        return new PageResponseResult(total, luckyInfoDTOList);
    }
}
