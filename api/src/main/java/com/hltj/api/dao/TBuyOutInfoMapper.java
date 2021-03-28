package com.hltj.api.dao;

import com.hltj.api.domain.TBuyOutInfo;
import com.hltj.api.domain.TBuyOutInfoExample;
import com.hltj.api.dto.BuyOutInfoDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TBuyOutInfoMapper {
    int countByExample(TBuyOutInfoExample example);

    int deleteByExample(TBuyOutInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TBuyOutInfo record);

    int insertSelective(TBuyOutInfo record);

    List<TBuyOutInfo> selectByExample(TBuyOutInfoExample example);

    TBuyOutInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TBuyOutInfo record, @Param("example") TBuyOutInfoExample example);

    int updateByExample(@Param("record") TBuyOutInfo record, @Param("example") TBuyOutInfoExample example);

    int updateByPrimaryKeySelective(TBuyOutInfo record);

    int updateByPrimaryKey(TBuyOutInfo record);

    //分页查询
    List<BuyOutInfoDTO> selectByBuyOutInfoDTO(@Param("param") BuyOutInfoDTO buyOutInfoDTO);

    int selectTotalByBuyOutInfoDTO(@Param("param") BuyOutInfoDTO buyOutInfoDTO);

}