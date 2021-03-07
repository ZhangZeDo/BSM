package com.hltj.consumer.controller;

import cn.hutool.poi.excel.ExcelReader;
import cn.hutool.poi.excel.ExcelUtil;
import com.hltj.api.domain.TStockInfo;
import com.hltj.api.dto.CustomerDTO;
import com.hltj.api.dto.PageResponseResult;
import com.hltj.api.dto.ResponseResult;
import com.hltj.api.dto.StockInfoDTO;
import com.hltj.api.exception.BussException;
import com.hltj.api.service.StockInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartException;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;
import java.util.Map;

/**
 * @author zhangzedong
 * @version 1.0
 * @date 2021/3/7 9:07
 */
@RestController
@RequestMapping("/stockInfo")
public class StockInfoController extends BaseController {
    private Logger logger = LoggerFactory.getLogger(StockInfoController.class);

    @Resource
    private StockInfoService stockInfoService;

    @RequestMapping(value = "uploadStockTemplateFile",method = RequestMethod.POST)
    @ResponseBody
    public Object uploadStockTemplateFile( @RequestParam(value = "file", required = false) MultipartFile file,
                                   HttpServletRequest request) {
        try{
            logger.info("用户开始上传文件");
            if (file == null) {
                return ResponseResult.error("上传文件为空，上传失败");
            }
            if (file.getOriginalFilename()==null || !file.getOriginalFilename().endsWith(".xlsx")) {
                return ResponseResult.error("必须上传.xlsx类文件");
            }
            String operator = getOperator(request);
            ExcelReader reader = ExcelUtil.getReader(file.getInputStream());
            List<Map<String,Object>> allStockList = reader.readAll();
            stockInfoService.batchInsertFromFile(allStockList,operator);
            return ResponseResult.ok();
        }catch (MultipartException mx){
            return ResponseResult.error("上传文件太大，请重新选择上传");
        }catch (BussException bss){
            return ResponseResult.error(bss.getMessage());
        }catch (Exception e){
            logger.error("文件导入失败，原因："+e.getMessage());
            return ResponseResult.error("文件上传失败");
        }
    }

    @RequestMapping(value = "queryStockInfoList",method = RequestMethod.POST)
    @ResponseBody
    public Object queryStockInfoList(@RequestBody StockInfoDTO stockInfoDTO) {
        try {
            PageResponseResult responseResult = stockInfoService.queryStockInfoList(stockInfoDTO);
            return ResponseResult.build(responseResult);
        }catch (BussException bse){
            return ResponseResult.error(bse.getMessage());
        }catch (Exception e){
            logger.error("查询股票列表信息失败，原因：",e);
            return ResponseResult.error("查询失败");
        }
    }

    @RequestMapping(value = "updateStockInfoStatus",method = RequestMethod.POST)
    @ResponseBody
    public Object updateStockInfoStatus(@RequestBody TStockInfo stockInfo, HttpServletRequest request) {
        try {
            String operator = getOperator(request);
            stockInfoService.updateStockInfoStatus(stockInfo,operator);
            return ResponseResult.ok();
        }catch (BussException bse){
            return ResponseResult.error(bse.getMessage());
        }catch (Exception e){
            logger.error("修改股票信息状态失败，原因：",e);
            return ResponseResult.error("修改失败");
        }
    }

    @RequestMapping(value = "deleteStockInfo",method = RequestMethod.POST)
    @ResponseBody
    public Object deleteStockInfo(@RequestBody TStockInfo stockInfo) {
        try {
            stockInfoService.deleteStockInfo(stockInfo.getId());
            return ResponseResult.ok();
        }catch (BussException bse){
            return ResponseResult.error(bse.getMessage());
        }catch (Exception e){
            logger.error("删除股票信息失败，原因：",e);
            return ResponseResult.error("删除失败");
        }
    }
}
