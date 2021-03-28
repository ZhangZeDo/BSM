package com.hltj.consumer.controller;

import com.hltj.api.dto.LuckyInfoDTO;
import com.hltj.api.dto.PageResponseResult;
import com.hltj.api.dto.ResponseResult;
import com.hltj.api.exception.BussException;
import com.hltj.api.service.LuckyInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author zhangzedong
 * @version 1.0
 * @date 2021/3/28 10:15
 */
@RestController
@RequestMapping("/luckyInfo")
public class LuckyInfoController extends BaseController {
    private Logger logger = LoggerFactory.getLogger(LuckyInfoController.class);

    @Resource
    private LuckyInfoService luckyInfoService;

    @RequestMapping(value = "queryLuckyInfoList",method = RequestMethod.POST)
    @ResponseBody
    public Object queryLuckyInfoList(@RequestBody LuckyInfoDTO luckyInfoDTO) {
        try {
            PageResponseResult responseResult = luckyInfoService.queryLuckyInfoListByDTO(luckyInfoDTO);
            return ResponseResult.build(responseResult);
        }catch (BussException bse){
            return ResponseResult.error(bse.getMessage());
        }catch (Exception e){
            logger.error("查询用户中签登记信息失败，原因：",e);
            return ResponseResult.error("查询失败");
        }
    }

    @RequestMapping(value = "insertLuckyInfo",method = RequestMethod.POST)
    @ResponseBody
    public Object insertLuckyInfo(@RequestBody LuckyInfoDTO luckyInfoDTO) {
        try {
            luckyInfoService.insertLuckyInfo(luckyInfoDTO,"system");
            return ResponseResult.success();
        }catch (BussException bse){
            return ResponseResult.error(bse.getMessage());
        }catch (Exception e){
            logger.error("插入用户中签登记信息失败，原因：",e);
            return ResponseResult.error("插入失败");
        }
    }

}
