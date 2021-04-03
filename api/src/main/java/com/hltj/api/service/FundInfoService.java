package com.hltj.api.service;

import com.hltj.api.dto.FundInfoDTO;
import com.hltj.api.dto.PageResponseResult;

import java.util.List;

/**
 * @author zhangzedong
 * @version 1.0
 * @date 2021/4/3 9:35
 */
public interface FundInfoService {
    //插入用户中签登记信息
    void insertFundInfo(FundInfoDTO fundInfoDTO, String operator);

    //分页查询用户中签登记信息
    PageResponseResult queryFundInfoListByDTO(FundInfoDTO fundInfoDTO);

    //查询基金名称列表
    List<String> queryFundNameGroupList();

    //删除基金信息
    void deleteFundInfo(int id);
}
