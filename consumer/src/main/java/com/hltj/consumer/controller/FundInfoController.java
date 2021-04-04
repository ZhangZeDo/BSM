package com.hltj.consumer.controller;

import com.hltj.api.dto.FundInfoDTO;
import com.hltj.api.dto.PageResponseResult;
import com.hltj.api.dto.ResponseResult;
import com.hltj.api.enums.FundOperateDirectEnum;
import com.hltj.api.exception.BussException;
import com.hltj.api.service.FundInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * @author zhangzedong
 * @version 1.0
 * @date 2021/4/3 9:53
 */
@RestController
@RequestMapping("/fundInfo")
public class FundInfoController extends BaseController {
    private Logger logger = LoggerFactory.getLogger(LuckyInfoController.class);

    @Resource
    private FundInfoService fundInfoService;

    @RequestMapping(value = "queryFundInfoList",method = RequestMethod.POST)
    @ResponseBody
    public Object queryFundInfoList(@RequestBody FundInfoDTO fundInfoDTO) {
        try {
            PageResponseResult responseResult = fundInfoService.queryFundInfoListByDTO(fundInfoDTO);
            return ResponseResult.build(responseResult);
        }catch (BussException bse){
            return ResponseResult.error(bse.getMessage());
        }catch (Exception e){
            logger.error("查询基金信息失败，原因：",e);
            return ResponseResult.error("查询失败");
        }
    }

    @RequestMapping(value = "insertFundInfo",method = RequestMethod.POST)
    @ResponseBody
    public Object insertFundInfo(@RequestBody FundInfoDTO fundInfoDTO) {
        try {
            fundInfoService.insertFundInfo(fundInfoDTO,"system");
            return ResponseResult.success();
        }catch (BussException bse){
            return ResponseResult.error(bse.getMessage());
        }catch (Exception e){
            logger.error("插入基金信息失败，原因：",e);
            return ResponseResult.error("插入失败");
        }
    }

    @RequestMapping(value = "queryFundNameList",method = RequestMethod.POST)
    @ResponseBody
    public Object queryFundNameList() {
        try {
            List<String> fundNameList = fundInfoService.queryFundNameGroupList();
            return ResponseResult.build(fundNameList);
        }catch (BussException bse){
            return ResponseResult.error(bse.getMessage());
        }catch (Exception e){
            logger.error("查询基金名称列表信息失败，原因：",e);
            return ResponseResult.error("查询基金名称列表失败");
        }
    }

    @RequestMapping(value = "queryDirectMap",method = RequestMethod.POST)
    @ResponseBody
    public Object queryDirectMap() {
        try {
            Map<String,String> enumMap = FundOperateDirectEnum.queryEnumMap();
            return ResponseResult.build(enumMap);
        }catch (Exception e){
            logger.error("查询基金枚举列表信息失败，原因：",e);
            return ResponseResult.error("查询基金枚举列表失败");
        }
    }

    @RequestMapping(value = "deleteFundInfo",method = RequestMethod.POST)
    @ResponseBody
    public Object deleteFundInfo(@RequestBody FundInfoDTO fundInfoDTO) {
        try {
            fundInfoService.deleteFundInfo(fundInfoDTO.getId());
            return ResponseResult.success();
        }catch (Exception e){
            logger.error("删除基金信息失败，原因：",e);
            return ResponseResult.error("删除基金信息失败");
        }
    }

    @RequestMapping(value = "updateFundInfo",method = RequestMethod.POST)
    @ResponseBody
    public Object updateFundInfo(@RequestBody FundInfoDTO fundInfoDTO, HttpServletRequest request) {
        try {
            String operator = getOperator(request);
            fundInfoService.updateFundInfo(fundInfoDTO,operator);
            return ResponseResult.success();
        }catch (Exception e){
            logger.error("更新基金信息失败，原因：",e);
            return ResponseResult.error("更新基金信息失败");
        }
    }


}
