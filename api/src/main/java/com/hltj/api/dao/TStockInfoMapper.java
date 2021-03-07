package com.hltj.api.dao;

import com.hltj.api.domain.TStockInfo;
import com.hltj.api.domain.TStockInfoExample;
import com.hltj.api.dto.StockInfoDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TStockInfoMapper {
    int countByExample(TStockInfoExample example);

    int deleteByExample(TStockInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(TStockInfo record);

    int insertSelective(TStockInfo record);

    List<TStockInfo> selectByExample(TStockInfoExample example);

    TStockInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TStockInfo record, @Param("example") TStockInfoExample example);

    int updateByExample(@Param("record") TStockInfo record, @Param("example") TStockInfoExample example);

    int updateByPrimaryKeySelective(TStockInfo record);

    int updateByPrimaryKey(TStockInfo record);

    /**
     * 分页查询股票基础信息列表
     * @param stockInfoDTO
     * @return
     */
    List<TStockInfo> selectByStockInfoDTO(@Param("param") StockInfoDTO stockInfoDTO);

    int selectTotalByStockInfoDTO(@Param("param") StockInfoDTO stockInfoDTO);

    void batchInsertStockInfo(List<TStockInfo> stockInfoList);
}