package com.hltj.consumer.controller;

import com.hltj.api.dto.*;
import com.hltj.api.enums.StockConfigConditionEnum;
import com.hltj.api.exception.BussException;
import com.hltj.api.service.StockConfigService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author zhangzedong
 * @version 1.0
 * @date 2021/4/10 10:21
 */
@RestController
@RequestMapping("/stockConfig")
public class StockConfigController extends BaseController {
    private Logger logger = LoggerFactory.getLogger(StockConfigController.class);

    @Resource
    private StockConfigService stockConfigService;

    @RequestMapping(value = "queryStockConfigList",method = RequestMethod.POST)
    @ResponseBody
    public Object queryStockConfigList(@RequestBody StockConfigDTO stockConfigDTO) {
        try {
            PageResponseResult responseResult = stockConfigService.queryStockConfigList(stockConfigDTO);
            return ResponseResult.build(responseResult);
        }catch (BussException bse){
            return ResponseResult.error(bse.getMessage());
        }catch (Exception e){
            logger.error("查询股票配置信息失败，原因：",e);
            return ResponseResult.error("查询失败");
        }
    }

    @RequestMapping(value = "insertStockConfig",method = RequestMethod.POST)
    @ResponseBody
    public Object insertStockConfig(@RequestBody StockConfigDTO stockConfigDTO) {
        try {
            stockConfigService.insertStockConfig(stockConfigDTO,"system");
            return ResponseResult.success();
        }catch (BussException bse){
            return ResponseResult.error(bse.getMessage());
        }catch (Exception e){
            logger.error("插入股票配置信息失败，原因：",e);
            return ResponseResult.error("插入失败");
        }
    }

    @RequestMapping(value = "updateStockConfig",method = RequestMethod.POST)
    @ResponseBody
    public Object updateStockConfig(@RequestBody StockConfigDTO stockConfigDTO, HttpServletRequest request) {
        try {
            String operator = getOperator(request);
            stockConfigService.updateStockConfig(stockConfigDTO,operator);
            return ResponseResult.success();
        }catch (Exception e){
            logger.error("更新股票配置信息失败，原因：",e);
            return ResponseResult.error("更新股票配置信息失败");
        }
    }

    @RequestMapping(value = "deleteStockConfig",method = RequestMethod.POST)
    @ResponseBody
    public Object deleteStockConfig(@RequestBody StockConfigDTO stockConfigDTO) {
        try {
            stockConfigService.deleteStockConfig(stockConfigDTO.getId());
            return ResponseResult.success();
        }catch (Exception e){
            logger.error("删除股票配置信息失败，原因：",e);
            return ResponseResult.error("删除股票配置信息失败");
        }
    }

    @RequestMapping(value = "queryConfigConditionEnum",method = RequestMethod.POST)
    @ResponseBody
    public Object queryConfigConditionEnum() {
        try {
            List<String> allEnumDescList = StockConfigConditionEnum.getAllEnumDesc();
            return ResponseResult.build(allEnumDescList);
        }catch (Exception e){
            logger.error("查询股票查询条件枚举失败，原因：",e);
            return ResponseResult.error("查询股票查询条件失败");
        }
    }
}
