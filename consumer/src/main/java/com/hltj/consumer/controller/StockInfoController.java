package com.hltj.consumer.controller;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.ObjectUtil;
import cn.hutool.poi.excel.ExcelReader;
import cn.hutool.poi.excel.ExcelUtil;
import com.hltj.api.domain.TStockInfo;
import com.hltj.api.dto.PageResponseResult;
import com.hltj.api.dto.ResponseResult;
import com.hltj.api.dto.StockInfoDTO;
import com.hltj.api.enums.EntityStatus;
import com.hltj.api.exception.BussException;
import com.hltj.api.service.StockInfoService;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartException;
import org.springframework.web.multipart.MultipartFile;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.util.*;

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

            List<TStockInfo> stockInfoList = new ArrayList<>();
            int rowNum = 1;
            try {
                for (Map<String, Object> stockInfoMap : allStockList) {
                    if (rowNum==146){
                        System.out.println();
                    }
                    TStockInfo stockInfo = setStockInfoFromMap(stockInfoMap,operator);
                    stockInfoList.add(stockInfo);
                    rowNum++;
                }
            }catch (Exception e){
                logger.error(e.getMessage());
                return ResponseResult.error("表格文件第"+rowNum+"行数据格式异常，请修改后重试");
            }
            if (CollectionUtil.isEmpty(stockInfoList)){
                return ResponseResult.error("上传的文件信息为空，请修改后重试");
            }
            stockInfoService.batchInsertStockList(stockInfoList);
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



    private TStockInfo setStockInfoFromMap(Map<String,Object> stockInfoMap,String operator){
        Iterator iterator = stockInfoMap.keySet().iterator();
        while (iterator.hasNext()) {
            Object key = iterator.next();
            Object value = stockInfoMap.get(key);
            if (ObjectUtil.isEmpty(value)){
                iterator.remove();
            }
        }

        TStockInfo stockInfo = new TStockInfo();
        stockInfo.setStockCode(stockInfoMap.getOrDefault("代码","").toString());
        stockInfo.setStockName(stockInfoMap.getOrDefault("股票名称","").toString());
        stockInfo.setListingDate(DateUtil.parse(stockInfoMap.getOrDefault("上市日期","").toString(),"yyyy-MM-dd HH:mm:ss"));
        stockInfo.setMarketValue(new BigDecimal(stockInfoMap.getOrDefault("发行市值","0").toString()));
        stockInfo.setFundRaise(new BigDecimal(stockInfoMap.getOrDefault("募集资金","0").toString()));
        stockInfo.setStockTotal(new BigDecimal(stockInfoMap.getOrDefault("总股数","0").toString()));
        stockInfo.setIssueRate(new BigDecimal(stockInfoMap.getOrDefault("发行比例","0").toString().replace("%","")).multiply(new BigDecimal(100)));
        stockInfo.setIssueNum(new BigDecimal(stockInfoMap.getOrDefault("发行数量","0").toString()));
        stockInfo.setIssuePrice(new BigDecimal(stockInfoMap.getOrDefault("发行价格","0").toString()));
        stockInfo.setHeap(new BigDecimal(stockInfoMap.getOrDefault("每手","0").toString()));
        stockInfo.setHeapPrice(new BigDecimal(stockInfoMap.getOrDefault("每手价格","0").toString()));
        stockInfo.setHeapTotal(new BigDecimal(stockInfoMap.getOrDefault("总手","0").toString()));
        stockInfo.setHeapRate(new BigDecimal(stockInfoMap.getOrDefault("一手率","0").toString()).multiply(new BigDecimal(100)));
        stockInfo.setAddress(stockInfoMap.getOrDefault("属地","").toString());
        stockInfo.setIndustry(stockInfoMap.getOrDefault("所属行业","").toString());
        stockInfo.setStockMarket(stockInfoMap.getOrDefault("股票市场","").toString());
        stockInfo.setGreenShoes(stockInfoMap.getOrDefault("绿鞋","").toString());
        stockInfo.setSponsor(stockInfoMap.getOrDefault("保荐人","").toString());
        stockInfo.setInvestor(stockInfoMap.getOrDefault("基石投资者","").toString());
        stockInfo.setSubscribeRate(new BigDecimal(stockInfoMap.getOrDefault("认购比例","0").toString()).multiply(new BigDecimal(100)));
        stockInfo.setFinanceMultiple(new BigDecimal(stockInfoMap.getOrDefault("融资倍数","0").toString()));
        stockInfo.setSubscribeMultiple(new BigDecimal(stockInfoMap.getOrDefault("认购倍数","0").toString()));
        stockInfo.setDarkRise(new BigDecimal(stockInfoMap.getOrDefault("暗盘涨幅","0").toString()).multiply(new BigDecimal(100)));
        stockInfo.setFirstRise(new BigDecimal(stockInfoMap.getOrDefault("首日涨幅","0").toString()).multiply(new BigDecimal(100)));
        stockInfo.setHoldRise(new BigDecimal(stockInfoMap.getOrDefault("长持涨幅","0").toString()).multiply(new BigDecimal(100)));
        stockInfo.setOpen(new BigDecimal(stockInfoMap.getOrDefault("公开","0").toString()));
        stockInfo.setGroupATop(new BigDecimal(stockInfoMap.getOrDefault("甲组顶格","0").toString()));
        stockInfo.setGroupAEnd(new BigDecimal(stockInfoMap.getOrDefault("甲尾","0").toString()));
        stockInfo.setGroupARate(new BigDecimal(stockInfoMap.getOrDefault("甲组中签率","0").toString()).multiply(new BigDecimal(100)));
        stockInfo.setGroupAMarket(new BigDecimal(stockInfoMap.getOrDefault("甲组市值","0").toString()));
        stockInfo.setGroupAProfit(new BigDecimal(stockInfoMap.getOrDefault("甲组盈利","0").toString()));
        stockInfo.setGroupBNum(new Integer(stockInfoMap.getOrDefault("乙组人数","0").toString()));
        stockInfo.setGroupBTop(new BigDecimal(stockInfoMap.getOrDefault("乙组头","0").toString()));
        stockInfo.setGroupBRate(new BigDecimal(stockInfoMap.getOrDefault("乙组中签率","0").toString()).multiply(new BigDecimal(100)));
        stockInfo.setPlugHammer(new Integer(stockInfoMap.getOrDefault("顶头锤","0").toString()));
        stockInfo.setGroupBMarket(new BigDecimal(stockInfoMap.getOrDefault("乙组市值","0").toString()));
        stockInfo.setGroupBProfit(new BigDecimal(stockInfoMap.getOrDefault("乙组盈利","0").toString()));

        stockInfo.setStatus(EntityStatus.Valid.getCode());
        stockInfo.setCreatedBy(operator);
        stockInfo.setUpdatedBy(operator);
        stockInfo.setCreateDatetime(new Date());
        stockInfo.setUpdateDatetime(new Date());

        return stockInfo;
    }

}
