package com.hltj.provider.serviceImpl;

import com.hltj.api.dao.TStockInfoMapper;
import com.hltj.api.domain.TStockInfo;
import com.hltj.api.dto.PageResponseResult;
import com.hltj.api.dto.StockInfoDTO;
import com.hltj.api.enums.TableId;
import com.hltj.api.exception.BussException;
import com.hltj.api.service.SequenceService;
import com.hltj.api.service.StockInfoService;
import com.hltj.provider.utils.UniqIdUtil;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.*;

/**
 * @author zhangzedong
 * @version 1.0
 * @date 2021/3/7 9:04
 */
@Service("stockInfoService")
public class StockInfoServiceImpl implements StockInfoService {
    private Logger logger = LoggerFactory.getLogger(StockInfoServiceImpl.class);

    @Resource
    private TStockInfoMapper stockInfoDao;
    @Resource
    private SequenceService sequenceService;

    @Override
    public PageResponseResult queryStockInfoList(StockInfoDTO stockInfoDTO) {
        Integer page = stockInfoDTO.getPage();
        if (stockInfoDTO.getPage() == null || stockInfoDTO.getPageSize() == null) {
            throw new BussException("非法入参");
        }
        if (page > 0) {
            stockInfoDTO.setStartNum((page - 1) * stockInfoDTO.getPageSize());
        } else {
            stockInfoDTO.setStartNum(0);
        }

        List<TStockInfo> stockInfoList = stockInfoDao.selectByStockInfoDTO(stockInfoDTO);
        int total = stockInfoDao.selectTotalByStockInfoDTO(stockInfoDTO);
        return new PageResponseResult(total, stockInfoList);
    }

    @Override
    public void batchInsertStockList(List<TStockInfo> stockInfoList) {
        for (TStockInfo stockInfo : stockInfoList) {
            stockInfo.setId(sequenceService.getBussId(TableId.ID_T_STOCK_INFO.getCode(),"S"));
        }
        stockInfoDao.batchInsertStockInfo(stockInfoList);
    }




    @Override
    public void updateStockInfoStatus(TStockInfo stockInfo, String operator) {
        if (StringUtils.isBlank(stockInfo.getId()) || stockInfo.getStatus()==null){
            throw new BussException("非法入参");
        }
        TStockInfo stockInfoFromDB = stockInfoDao.selectByPrimaryKey(stockInfo.getId());
        if (stockInfoFromDB == null){
            throw new BussException("未找到对应的股票信息，删除失败");
        }
        stockInfoFromDB.setStatus(stockInfo.getStatus());
        stockInfoFromDB.setUpdatedBy(operator);
        stockInfoFromDB.setUpdateDatetime(new Date());

        stockInfoDao.updateByPrimaryKey(stockInfoFromDB);
    }

    @Override
    public void deleteStockInfo(String key) {
        if (StringUtils.isBlank(key)){
            throw new BussException("删除股票的主键不能为空");
        }
        stockInfoDao.deleteByPrimaryKey(key);
    }


}
