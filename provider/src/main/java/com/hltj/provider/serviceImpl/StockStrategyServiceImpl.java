package com.hltj.provider.serviceImpl;

import com.hltj.api.dao.TStockStrategyMapper;
import com.hltj.api.domain.BaseEntity;
import com.hltj.api.domain.TStockInfo;
import com.hltj.api.domain.TStockStrategy;
import com.hltj.api.dto.PageResponseResult;
import com.hltj.api.dto.StockStrategyDTO;
import com.hltj.api.enums.EntityStatus;
import com.hltj.api.exception.BussException;
import com.hltj.api.service.StockInfoService;
import com.hltj.api.service.StockStrategyService;
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
 * @date 2021/3/14 11:15
 */
@Service("stockStrategyService")
public class StockStrategyServiceImpl implements StockStrategyService {
    private static final Logger logger = LoggerFactory.getLogger(StockStrategyServiceImpl.class);
    @Resource
    private TStockStrategyMapper stockStrategyDao;
    @Resource
    private StockInfoService stockInfoService;

    @Override
    public PageResponseResult queryStockStrategyList(StockStrategyDTO stockStrategyDTO) {
        Integer page = stockStrategyDTO.getPage();
        if (stockStrategyDTO.getPage() == null || stockStrategyDTO.getPageSize() == null) {
            throw new BussException("非法入参");
        }
        if (page > 0) {
            stockStrategyDTO.setStartNum((page - 1) * stockStrategyDTO.getPageSize());
        } else {
            stockStrategyDTO.setStartNum(0);
        }

        List<TStockStrategy> stockStrategyList = stockStrategyDao.selectByStockStrategyDTO(stockStrategyDTO);
        int total = stockStrategyDao.selectTotalByStockStrategyDTO(stockStrategyDTO);
        return new PageResponseResult(total, stockStrategyList);
    }

    @Override
    public void insertStockStrategy(TStockStrategy stockStrategy, String operator) {
        stockStrategy.setId(UniqIdUtil.getUniqId());
        String stockName = stockStrategy.getStockName();

        TStockInfo stockInfo = stockInfoService.queryStockInfoByStockName(stockName);
        stockStrategy.setStockCode(stockInfo.getStockCode());
        stockStrategy.setStatus(EntityStatus.Valid.getCode());
        stockStrategy.setCreatedBy(operator);
        stockStrategy.setUpdatedBy(operator);

        stockStrategyDao.insert(stockStrategy);
    }

    @Override
    public void updateStockStrategy(TStockStrategy stockStrategy, String operator) {
        stockStrategy.setUpdatedBy(operator);
        stockStrategyDao.updateByPrimaryKeySelective(stockStrategy);
    }

    @Override
    public void updateStockStrategyStatus(TStockStrategy stockStrategy, String operator) {
        if (StringUtils.isBlank(stockStrategy.getId()) || stockStrategy.getStatus()==null){
            throw new BussException("非法入参");
        }
        TStockStrategy stockStrategyFromDB = stockStrategyDao.selectByPrimaryKey(stockStrategy.getId());
        if (stockStrategyFromDB == null){
            throw new BussException("未找到对应的股票策略信息，删除失败");
        }
        stockStrategyFromDB.setStatus(stockStrategy.getStatus());
        stockStrategyFromDB.setUpdatedBy(operator);
        stockStrategyFromDB.setUpdateDatetime(new Date());

        stockStrategyDao.updateByPrimaryKey(stockStrategyFromDB);
    }

    @Override
    public void deleteStockStrategy(String key) {
        if (StringUtils.isBlank(key)){
            throw new BussException("删除股票策略的主键不能为空");
        }
        stockStrategyDao.deleteByPrimaryKey(key);
    }
}
