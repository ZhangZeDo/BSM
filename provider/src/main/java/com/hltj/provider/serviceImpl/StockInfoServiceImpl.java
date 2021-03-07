package com.hltj.provider.serviceImpl;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.date.DateUtil;
import cn.hutool.poi.excel.ExcelReader;
import cn.hutool.poi.excel.ExcelUtil;
import com.hltj.api.dao.TStockInfoMapper;
import com.hltj.api.domain.TStockInfo;
import com.hltj.api.dto.PageResponseResult;
import com.hltj.api.dto.StockInfoDTO;
import com.hltj.api.enums.EntityStatus;
import com.hltj.api.exception.BussException;
import com.hltj.api.service.StockInfoService;
import com.hltj.provider.utils.UniqIdUtil;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author zhangzedong
 * @version 1.0
 * @date 2021/3/7 9:04
 */
@Service("stockInfoService")
public class StockInfoServiceImpl implements StockInfoService {
    private Logger logger = LoggerFactory.getLogger(StockInfoServiceImpl.class);

    @Resource
    private TStockInfoMapper stockInfoDao;

    @Override
    public PageResponseResult queryStockInfoList(StockInfoDTO stockInfoDTO) {
        Integer page = stockInfoDTO.getPage();
        if (stockInfoDTO.getPage() == null || stockInfoDTO.getPageSize() == null) {
            throw new BussException("非法入参");
        }
        if (page > 0) {
            stockInfoDTO.setStartNum((page - 1) * stockInfoDTO.getPageSize());
        } else {
            stockInfoDTO.setStartNum(0);
        }

        List<TStockInfo> stockInfoList = stockInfoDao.selectByStockInfoDTO(stockInfoDTO);
        int total = stockInfoDao.selectTotalByStockInfoDTO(stockInfoDTO);
        return new PageResponseResult(total, stockInfoList);
    }

    @Override
    public void batchInsertFromFile(List<Map<String,Object>> allStockList, String operator) {
        List<TStockInfo> stockInfoList = new ArrayList<>();
        int rowNum = 1;
        try {
            for (Map<String, Object> stockInfoMap : allStockList) {
                TStockInfo stockInfo = setStockInfoFromMap(stockInfoMap,operator);
                stockInfoList.add(stockInfo);
                rowNum++;
            }
        }catch (Exception e){
            logger.error("从表格文件从读取股票信息异常，异常行数{}，原因：{}",rowNum,e);
            throw new BussException("表格文件第"+rowNum+"行数据格式异常，请修改后重试");
        }

        if (CollectionUtil.isNotEmpty(stockInfoList)){
            stockInfoDao.batchInsertStockInfo(stockInfoList);
        }
    }

    private TStockInfo setStockInfoFromMap(Map<String,Object> stockInfoMap,String operator){
        TStockInfo stockInfo = new TStockInfo();
        stockInfo.setId(UniqIdUtil.getUniqId());
        stockInfo.setStockCode(stockInfoMap.get("股票代码").toString());
        stockInfo.setStockName(stockInfoMap.get("股票名称").toString());
        stockInfo.setListingDate(DateUtil.parse(stockInfoMap.get("上市日期").toString(),"yyyy/MM/dd"));
        stockInfo.setMarketValue(new BigDecimal(stockInfoMap.get("发行市值").toString()));
        stockInfo.setFundRaise(new BigDecimal(stockInfoMap.get("募集资金").toString()));
        stockInfo.setStockTotal(new BigDecimal(stockInfoMap.get("总股数").toString()));
        stockInfo.setIssueRate(new BigDecimal(stockInfoMap.get("发行比例").toString()));
        stockInfo.setIssueNum(new BigDecimal(stockInfoMap.get("发行数量").toString()));
        stockInfo.setIssuePrice(new BigDecimal(stockInfoMap.get("发行价格").toString()));
        stockInfo.setHeap(new BigDecimal(stockInfoMap.get("每手").toString()));
        stockInfo.setHeapPrice(new BigDecimal(stockInfoMap.get("每手价格").toString()));
        stockInfo.setHeapTotal(new BigDecimal(stockInfoMap.get("总手").toString()));
        stockInfo.setHeapRate(new BigDecimal(stockInfoMap.get("一手率").toString()));
        stockInfo.setAddress(stockInfoMap.get("所属地址").toString());
        stockInfo.setIndustry(stockInfoMap.get("所属行业").toString());
        stockInfo.setStockMarket(stockInfoMap.get("股票市场").toString());
        stockInfo.setGreenShoes(stockInfoMap.get("绿鞋").toString());
        stockInfo.setSponsor(stockInfoMap.get("保荐人").toString());
        stockInfo.setInvestor(stockInfoMap.get("基石投资者").toString());
        stockInfo.setSubscribeRate(new BigDecimal(stockInfoMap.get("认购比例").toString()));
        stockInfo.setFinanceMultiple(new BigDecimal(stockInfoMap.get("融资倍数").toString()));
        stockInfo.setSubscribeMultiple(new BigDecimal(stockInfoMap.get("认购倍数").toString()));
        stockInfo.setDarkRise(new BigDecimal(stockInfoMap.get("暗盘涨幅").toString()));
        stockInfo.setFirstRise(new BigDecimal(stockInfoMap.get("首日涨幅").toString()));
        stockInfo.setHoldRise(new BigDecimal(stockInfoMap.get("长持涨幅").toString()));
        stockInfo.setOpen(new BigDecimal(stockInfoMap.get("公开").toString()));
        stockInfo.setGroupATop(new BigDecimal(stockInfoMap.get("甲组顶格").toString()));
        stockInfo.setGroupAEnd(new BigDecimal(stockInfoMap.get("甲尾").toString()));
        stockInfo.setGroupARate(new BigDecimal(stockInfoMap.get("甲组中签率").toString()));
        stockInfo.setGroupAMarket(new BigDecimal(stockInfoMap.get("甲组市值").toString()));
        stockInfo.setGroupAProfit(new BigDecimal(stockInfoMap.get("甲组盈利").toString()));
        stockInfo.setGroupBNum(new Integer(stockInfoMap.get("乙组人数").toString()));
        stockInfo.setGroupBTop(new BigDecimal(stockInfoMap.get("乙组头").toString()));
        stockInfo.setGroupBRate(new BigDecimal(stockInfoMap.get("乙组中签率").toString()));
        stockInfo.setPlugHammer(new Integer(stockInfoMap.get("顶头锤").toString()));
        stockInfo.setGroupBMarket(new BigDecimal(stockInfoMap.get("乙组市值").toString()));
        stockInfo.setGroupBProfit(new BigDecimal(stockInfoMap.get("乙组盈利").toString()));

        stockInfo.setStatus(EntityStatus.Valid.getCode());
        stockInfo.setCreatedBy(operator);
        stockInfo.setUpdatedBy(operator);
        stockInfo.setCreateDatetime(new Date());
        stockInfo.setUpdateDatetime(new Date());

        return stockInfo;
    }



    @Override
    public void updateStockInfoStatus(TStockInfo stockInfo, String operator) {
        if (StringUtils.isBlank(stockInfo.getId()) || stockInfo.getStatus()==null){
            throw new BussException("非法入参");
        }
        TStockInfo stockInfoFromDB = stockInfoDao.selectByPrimaryKey(stockInfo.getId());
        if (stockInfoFromDB == null){
            throw new BussException("未找到对应的股票信息，删除失败");
        }
        stockInfoFromDB.setStatus(stockInfo.getStatus());
        stockInfoFromDB.setUpdatedBy(operator);
        stockInfoFromDB.setUpdateDatetime(new Date());

        stockInfoDao.updateByPrimaryKey(stockInfoFromDB);
    }

    @Override
    public void deleteStockInfo(String key) {
        if (StringUtils.isBlank(key)){
            throw new BussException("删除股票的主键不能为空");
        }
        stockInfoDao.deleteByPrimaryKey(key);
    }


}
