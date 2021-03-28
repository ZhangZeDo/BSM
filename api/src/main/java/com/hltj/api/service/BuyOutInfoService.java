package com.hltj.api.service;

import com.hltj.api.dto.BuyOutInfoDTO;
import com.hltj.api.dto.PageResponseResult;

/**
 * @author zhangzedong
 * @version 1.0
 * @date 2021/3/28 10:12
 */
public interface BuyOutInfoService {
    //插入用户卖出登记信息
    void insertBuyOutInfo(BuyOutInfoDTO buyOutInfoDTO, String operator);

    //分页查询用户卖出登记信息
    PageResponseResult queryBuyOutInfoListByDTO(BuyOutInfoDTO buyOutInfoDTO);
}
