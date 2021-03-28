package com.hltj.api.dao;

import com.hltj.api.domain.TLuckyInfo;
import com.hltj.api.domain.TLuckyInfoExample;
import com.hltj.api.dto.LuckyInfoDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TLuckyInfoMapper {
    int countByExample(TLuckyInfoExample example);

    int deleteByExample(TLuckyInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TLuckyInfo record);

    int insertSelective(TLuckyInfo record);

    List<TLuckyInfo> selectByExample(TLuckyInfoExample example);

    TLuckyInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TLuckyInfo record, @Param("example") TLuckyInfoExample example);

    int updateByExample(@Param("record") TLuckyInfo record, @Param("example") TLuckyInfoExample example);

    int updateByPrimaryKeySelective(TLuckyInfo record);

    int updateByPrimaryKey(TLuckyInfo record);

    //分页查询
    List<LuckyInfoDTO> selectByLuckyInfoDTO(@Param("param") LuckyInfoDTO luckyInfoDTO);

    int selectTotalByLuckyInfoDTO(@Param("param") LuckyInfoDTO luckyInfoDTO);
}