package com.hltj.api.service;

import com.hltj.api.domain.TStockInfo;
import com.hltj.api.dto.CustomerDTO;
import com.hltj.api.dto.PageResponseResult;
import com.hltj.api.dto.StockInfoDTO;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;
import java.util.Map;

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
     * @param allStockList
     */
    void batchInsertFromFile(List<Map<String,Object>> allStockList, String operator);

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
}
