package com.hltj.consumer.controller;

import com.hltj.api.domain.TStockStrategy;
import com.hltj.api.dto.PageResponseResult;
import com.hltj.api.dto.ResponseResult;
import com.hltj.api.dto.StockStrategyDTO;
import com.hltj.api.exception.BussException;
import com.hltj.api.service.StockStrategyService;
import com.hltj.api.utils.FileUtil;
import com.hltj.consumer.constants.ConsumerConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;

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

    @RequestMapping(value = "insertStockStrategy",method = RequestMethod.POST)
    @ResponseBody
    public Object insertStockStrategy(@RequestParam(value = "file",required = false)MultipartFile file,@RequestParam("stockName") String stockName,
                                      @RequestParam("startShareDate") Date startShareDate, @RequestParam("endShareDate") Date endShareDate,
                                      @RequestParam("darkDate") Date darkDate,@RequestParam("listingDate") Date listingDate,
                                      @RequestParam("moduleName") String moduleName,@RequestParam("moduleContent") String moduleContent,
                                      HttpServletRequest request) {
        try {
            String operator = getOperator(request);
            TStockStrategy stockStrategy = new TStockStrategy();
            if (file == null){
                return ResponseResult.error("上传文件不能为空");
            }
            String moduleImageUrl = FileUtil.uploadFile(ConsumerConstants.moduleImageSavePath,file.getInputStream(),file.getOriginalFilename());
            stockStrategy.setModuleImage(moduleImageUrl);
            stockStrategy.setStockName(stockName);
            stockStrategy.setStartShareDate(startShareDate);
            stockStrategy.setEndShareDate(endShareDate);
            stockStrategy.setDarkDate(darkDate);
            stockStrategy.setListingDate(listingDate);
            stockStrategy.setModuleName(moduleName);
            stockStrategy.setModuleContent(moduleContent);

            stockStrategyService.insertStockStrategy(stockStrategy,operator);
            return ResponseResult.ok();
        }catch (BussException bse){
            return ResponseResult.error(bse.getMessage());
        }catch (Exception e){
            logger.error("新增股票策略信息失败，原因：",e);
            return ResponseResult.error("新增失败");
        }
    }

    @RequestMapping(value = "updateStockStrategy",method = RequestMethod.POST)
    @ResponseBody
    public Object updateStockStrategy(@RequestParam(value = "file",required = false)MultipartFile file,@RequestParam("id") String id,
                                      @RequestParam("stockCode") String stockCode,@RequestParam("stockName") String stockName,
                                      @RequestParam("startShareDate") Date startShareDate, @RequestParam("endShareDate") Date endShareDate,
                                      @RequestParam("darkDate") Date darkDate,@RequestParam("listingDate") Date listingDate,
                                      @RequestParam("moduleName") String moduleName,@RequestParam("moduleContent") String moduleContent,
                                      HttpServletRequest request) {
        try {
            String operator = getOperator(request);
            TStockStrategy stockStrategy = new TStockStrategy();
            if (file != null){
                stockStrategy.setModuleImage("filepath");
            }
            stockStrategy.setId(id);
            stockStrategy.setStockName(stockName);
            stockStrategy.setStockCode(stockCode);
            stockStrategy.setStartShareDate(startShareDate);
            stockStrategy.setEndShareDate(endShareDate);
            stockStrategy.setDarkDate(darkDate);
            stockStrategy.setListingDate(listingDate);
            stockStrategy.setModuleName(moduleName);
            stockStrategy.setModuleContent(moduleContent);

            stockStrategyService.updateStockStrategy(stockStrategy,operator);
            return ResponseResult.ok();
        }catch (BussException bse){
            return ResponseResult.error(bse.getMessage());
        }catch (Exception e){
            logger.error("更新股票策略信息失败，原因：",e);
            return ResponseResult.error("修改失败");
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
