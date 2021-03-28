package com.hltj.api.service;

import com.hltj.api.dto.LuckyInfoDTO;
import com.hltj.api.dto.PageResponseResult;

/**
 * @author zhangzedong
 * @version 1.0
 * @date 2021/3/28 10:11
 */
public interface LuckyInfoService {
    //插入用户中签登记信息
    void insertLuckyInfo(LuckyInfoDTO luckyInfoDTO,String operator);

    //分页查询用户中签登记信息
    PageResponseResult queryLuckyInfoListByDTO(LuckyInfoDTO luckyInfoDTO);
}
