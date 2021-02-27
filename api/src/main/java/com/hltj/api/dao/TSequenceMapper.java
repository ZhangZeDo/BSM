package com.hltj.api.dao;

import com.hltj.api.domain.TSequence;
import com.hltj.api.domain.TSequenceExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TSequenceMapper {
    int countByExample(TSequenceExample example);

    int deleteByExample(TSequenceExample example);

    int deleteByPrimaryKey(String sequenceName);

    int insert(TSequence record);

    int insertSelective(TSequence record);

    List<TSequence> selectByExample(TSequenceExample example);

    TSequence selectByPrimaryKey(String sequenceName);

    int updateByExampleSelective(@Param("record") TSequence record, @Param("example") TSequenceExample example);

    int updateByExample(@Param("record") TSequence record, @Param("example") TSequenceExample example);

    int updateByPrimaryKeySelective(TSequence record);

    int updateByPrimaryKey(TSequence record);
}