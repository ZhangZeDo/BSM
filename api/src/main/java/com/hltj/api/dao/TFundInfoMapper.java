package com.hltj.api.dao;

import com.hltj.api.domain.TFundInfo;
import com.hltj.api.domain.TFundInfoExample;
import com.hltj.api.dto.FundInfoDTO;
import com.hltj.api.dto.LuckyInfoDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TFundInfoMapper {
    int countByExample(TFundInfoExample example);

    int deleteByExample(TFundInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TFundInfo record);

    int insertSelective(TFundInfo record);

    List<TFundInfo> selectByExample(TFundInfoExample example);

    TFundInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TFundInfo record, @Param("example") TFundInfoExample example);

    int updateByExample(@Param("record") TFundInfo record, @Param("example") TFundInfoExample example);

    int updateByPrimaryKeySelective(TFundInfo record);

    int updateByPrimaryKey(TFundInfo record);

    /**
     * 分页查询基金信息
     * @param fundInfoDTO
     * @return
     */
    List<FundInfoDTO> selectByFundInfoDTO(@Param("param") FundInfoDTO fundInfoDTO);

    int selectTotalByFundInfoDTO(@Param("param") FundInfoDTO fundInfoDTO);

    //查询基金名称列表
    List<String> queryFundNameGroupList();
}