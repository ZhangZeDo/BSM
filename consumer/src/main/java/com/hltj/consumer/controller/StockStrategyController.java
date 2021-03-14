package com.hltj.consumer.controller;

import com.hltj.api.domain.TStockStrategy;
import com.hltj.api.dto.PageResponseResult;
import com.hltj.api.dto.ResponseResult;
import com.hltj.api.dto.StockStrategyDTO;
import com.hltj.api.exception.BussException;
import com.hltj.api.service.StockStrategyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @author zhangzedong
 * @version 1.0
 * @date 2021/3/14 11:32
 */
@RestController
@RequestMapping("/stockStrategy")
public class StockStrategyController extends BaseController {
    private static final Logger logger = LoggerFactory.getLogger(StockStrategyController.class);
    @Resource
    private StockStrategyService stockStrategyService;

    @RequestMapping(value = "queryStockStrategyList",method = RequestMethod.POST)
    @ResponseBody
    public Object queryStockInfoList(@RequestBody StockStrategyDTO stockStrategyDTO) {
        try {
            PageResponseResult responseResult = stockStrategyService.queryStockStrategyList(stockStrategyDTO);
            return ResponseResult.build(responseResult);
        }catch (BussException bse){
            return ResponseResult.error(bse.getMessage());
        }catch (Exception e){
            logger.error("查询股票策略列表信息失败，原因：",e);
            return ResponseResult.error("查询失败");
        }
    }

    @RequestMapping(value = "updateStockStrategyStatus",method = RequestMethod.POST)
    @ResponseBody
    public Object updateStockStrategyStatus(@RequestBody TStockStrategy stockStrategy, HttpServletRequest request) {
        try {
            String operator = getOperator(request);
            stockStrategyService.updateStockStrategyStatus(stockStrategy,operator);
            return ResponseResult.ok();
        }catch (BussException bse){
            return ResponseResult.error(bse.getMessage());
        }catch (Exception e){
            logger.error("修改股票策略信息状态失败，原因：",e);
            return ResponseResult.error("修改失败");
        }
    }

    @RequestMapping(value = "deleteStockStrategy",method = RequestMethod.POST)
    @ResponseBody
    public Object deleteStockStrategy(@RequestBody TStockStrategy stockStrategy) {
        try {
            stockStrategyService.deleteStockStrategy(stockStrategy.getId());
            return ResponseResult.ok();
        }catch (BussException bse){
            return ResponseResult.error(bse.getMessage());
        }catch (Exception e){
            logger.error("删除股票策略信息失败，原因：",e);
            return ResponseResult.error("删除失败");
        }
    }
}
