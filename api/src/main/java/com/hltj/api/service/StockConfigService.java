package com.hltj.api.service;

import com.hltj.api.dto.PageResponseResult;
import com.hltj.api.dto.StockConfigDTO;

/**
 * @author zhangzedong
 * @version 1.0
 * @date 2021/4/10 9:51
 */
public interface StockConfigService {
    /**
     * 分页查询股票配置信息
     * @param stockConfigDTO
     * @return
     */
    PageResponseResult queryStockConfigList(StockConfigDTO stockConfigDTO);

    /**
     * 新增股票配置信息
     * @param stockConfigDTO
     * @param operator
     */
    void insertStockConfig(StockConfigDTO stockConfigDTO,String operator);

    /**
     * 更新股票配置信息
     * @param stockConfigDTO
     * @param operator
     */
    void updateStockConfig(StockConfigDTO stockConfigDTO,String operator);

    /**
     * 根据主键删除
     * @param key
     */
    void deleteStockConfig(int key);
}
