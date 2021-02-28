package com.hltj.api.dao;

import com.hltj.api.domain.TCustomer;
import com.hltj.api.domain.TCustomerExample;
import java.util.List;

import com.hltj.api.dto.CustomerDTO;
import org.apache.ibatis.annotations.Param;

public interface TCustomerMapper {
    int countByExample(TCustomerExample example);

    int deleteByExample(TCustomerExample example);

    int deleteByPrimaryKey(String id);

    int insert(TCustomer record);

    int insertSelective(TCustomer record);

    List<TCustomer> selectByExample(TCustomerExample example);

    TCustomer selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TCustomer record, @Param("example") TCustomerExample example);

    int updateByExample(@Param("record") TCustomer record, @Param("example") TCustomerExample example);

    int updateByPrimaryKeySelective(TCustomer record);

    int updateByPrimaryKey(TCustomer record);

    /**
     * 分页查询数据
     * @param customerDTO
     * @return
     */
    List<TCustomer> selectByCustomerDTO(@Param("param") CustomerDTO customerDTO);

    int selectTotalByCustomerDTO(@Param("param") CustomerDTO customerDTO);
}