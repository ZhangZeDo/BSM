package com.hltj.api.service;

import com.hltj.api.domain.TStockInfo;
import com.hltj.api.dto.PageResponseResult;
import com.hltj.api.dto.StockInfoDTO;
import java.util.List;

/**
 * @author zhangzedong
 * @version 1.0
 * @date 2021/3/7 9:04
 */
public interface StockInfoService {
    /**
     * 分页查询股票信息列表
     * @param stockInfoDTO
     * @return
     */
    PageResponseResult queryStockInfoList(StockInfoDTO stockInfoDTO);

    /**
     * 从文件中导入股票信息
     * @param stockInfoList
     */
    void batchInsertStockList(List<TStockInfo> stockInfoList);

    /**
     * 修改股票状态信息
     * @param stockInfo
     * @param operator
     */
    void updateStockInfoStatus(TStockInfo stockInfo, String operator);

    /**
     * 根据主键删除股票信息
     * @param key
     */
    void deleteStockInfo(String key);

    /**
     * 根据股票代码查询对应的股票信息
     * @param stockCode
     * @return
     */
    TStockInfo queryStockInfoByStockCode(String stockCode);

    /**
     * 根据股票名称查询对应的股票信息
     * @param stockName
     * @return
     */
    TStockInfo queryStockInfoByStockName(String stockName);
}
