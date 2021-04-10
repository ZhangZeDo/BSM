package com.hltj.api.dao;

import com.hltj.api.domain.TStockConfig;
import com.hltj.api.domain.TStockConfigExample;
import com.hltj.api.dto.StockConfigDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TStockConfigMapper {
    int countByExample(TStockConfigExample example);

    int deleteByExample(TStockConfigExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TStockConfig record);

    int insertSelective(TStockConfig record);

    List<TStockConfig> selectByExample(TStockConfigExample example);

    TStockConfig selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TStockConfig record, @Param("example") TStockConfigExample example);

    int updateByExample(@Param("record") TStockConfig record, @Param("example") TStockConfigExample example);

    int updateByPrimaryKeySelective(TStockConfig record);

    int updateByPrimaryKey(TStockConfig record);

    //分页查询
    List<StockConfigDTO> selectByStockConfigDTO(@Param("param") StockConfigDTO stockConfigDTO);

    int selectTotalByStockConfigDTO(@Param("param") StockConfigDTO stockConfigDTO);
}