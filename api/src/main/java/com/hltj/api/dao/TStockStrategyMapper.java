package com.hltj.api.dao;

import com.hltj.api.domain.TStockStrategy;
import com.hltj.api.domain.TStockStrategyExample;
import com.hltj.api.dto.StockStrategyDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TStockStrategyMapper {
    int countByExample(TStockStrategyExample example);

    int deleteByExample(TStockStrategyExample example);

    int deleteByPrimaryKey(String id);

    int insert(TStockStrategy record);

    int insertSelective(TStockStrategy record);

    List<TStockStrategy> selectByExampleWithBLOBs(TStockStrategyExample example);

    List<TStockStrategy> selectByExample(TStockStrategyExample example);

    TStockStrategy selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TStockStrategy record, @Param("example") TStockStrategyExample example);

    int updateByExampleWithBLOBs(@Param("record") TStockStrategy record, @Param("example") TStockStrategyExample example);

    int updateByExample(@Param("record") TStockStrategy record, @Param("example") TStockStrategyExample example);

    int updateByPrimaryKeySelective(TStockStrategy record);

    int updateByPrimaryKeyWithBLOBs(TStockStrategy record);

    int updateByPrimaryKey(TStockStrategy record);

    /**
     * 分页查询列表
     * @param stockStrategyDTO
     */
    List<TStockStrategy> selectByStockStrategyDTO(@Param("param") StockStrategyDTO stockStrategyDTO);

    int selectTotalByStockStrategyDTO(@Param("param")StockStrategyDTO stockStrategyDTO);
}