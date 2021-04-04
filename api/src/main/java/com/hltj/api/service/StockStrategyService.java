package com.hltj.api.service;

import com.hltj.api.domain.TStockStrategy;
import com.hltj.api.dto.PageResponseResult;
import com.hltj.api.dto.StockStrategyDTO;

/**
 * @author zhangzedong
 * @version 1.0
 * @date 2021/3/14 11:12
 */
public interface StockStrategyService {
    /**
     * 分页查询股票策略列表
     * @param stockStrategyDTO
     * @return
     */
    PageResponseResult queryStockStrategyList(StockStrategyDTO stockStrategyDTO);

    /**
     * 新增股票策略
     * @param stockStrategy
     * @param operator
     */
    void insertStockStrategy(TStockStrategy stockStrategy, String operator);

    /**
     * 更新股票策略
     * @param stockStrategy
     * @param operator
     */
    void updateStockStrategy(TStockStrategy stockStrategy, String operator);

    /**
     * 修改股票策略状态
     * @param stockStrategy
     * @param operator
     */
    void updateStockStrategyStatus(TStockStrategy stockStrategy, String operator);

    /**
     * 根据主键删除股票策略
     * @param key
     */
    void deleteStockStrategy(String key);
}
