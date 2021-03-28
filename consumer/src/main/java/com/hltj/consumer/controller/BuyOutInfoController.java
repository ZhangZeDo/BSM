package com.hltj.consumer.controller;

import com.hltj.api.dto.BuyOutInfoDTO;
import com.hltj.api.dto.PageResponseResult;
import com.hltj.api.dto.ResponseResult;
import com.hltj.api.exception.BussException;
import com.hltj.api.service.BuyOutInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author zhangzedong
 * @version 1.0
 * @date 2021/3/28 10:16
 */
@RestController
@RequestMapping("/buyOutInfo")
public class BuyOutInfoController extends BaseController {
    private Logger logger = LoggerFactory.getLogger(BuyOutInfoController.class);

    @Resource
    private BuyOutInfoService buyOutInfoService;

    @RequestMapping(value = "queryBuyOutInfoList",method = RequestMethod.POST)
    @ResponseBody
    public Object queryBuyOutInfoList(@RequestBody BuyOutInfoDTO buyOutInfoDTO) {
        try {
            PageResponseResult responseResult = buyOutInfoService.queryBuyOutInfoListByDTO(buyOutInfoDTO);
            return ResponseResult.build(responseResult);
        }catch (BussException bse){
            return ResponseResult.error(bse.getMessage());
        }catch (Exception e){
            logger.error("查询用户卖出信息失败，原因：",e);
            return ResponseResult.error("查询失败");
        }
    }

    @RequestMapping(value = "insertBuyOutInfo",method = RequestMethod.POST)
    @ResponseBody
    public Object insertBuyOutInfo(@RequestBody BuyOutInfoDTO buyOutInfoDTO) {
        try {
            buyOutInfoService.insertBuyOutInfo(buyOutInfoDTO,"system");
            return ResponseResult.success();
        }catch (BussException bse){
            return ResponseResult.error(bse.getMessage());
        }catch (Exception e){
            logger.error("插入用户卖出信息失败，原因：",e);
            return ResponseResult.error("插入失败");
        }
    }
}
