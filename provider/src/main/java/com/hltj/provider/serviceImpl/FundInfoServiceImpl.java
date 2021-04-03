package com.hltj.provider.serviceImpl;

import com.hltj.api.dao.TFundInfoMapper;
import com.hltj.api.domain.TCustomer;
import com.hltj.api.domain.TFundInfo;
import com.hltj.api.domain.TLuckyInfo;
import com.hltj.api.domain.TStockInfo;
import com.hltj.api.dto.FundInfoDTO;
import com.hltj.api.dto.LuckyInfoDTO;
import com.hltj.api.dto.PageResponseResult;
import com.hltj.api.exception.BussException;
import com.hltj.api.service.FundInfoService;
import com.hltj.api.service.StockInfoService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zhangzedong
 * @version 1.0
 * @date 2021/4/3 9:37
 */
@Service("fundInfoService")
public class FundInfoServiceImpl implements FundInfoService {
    private Logger logger = LoggerFactory.getLogger(FundInfoServiceImpl.class);
    @Resource
    private TFundInfoMapper fundInfoDao;
    @Resource
    private StockInfoService stockInfoService;

    @Override
    public void insertFundInfo(FundInfoDTO fundInfoDTO, String operator) {
        if (StringUtils.isBlank(fundInfoDTO.getStockName())){
            throw new BussException("股票名称不能为空");
        }
        TStockInfo stockInfo = stockInfoService.queryStockInfoByStockName(fundInfoDTO.getStockName());
        TFundInfo fundInfo = new TFundInfo();
        BeanUtils.copyProperties(fundInfoDTO,fundInfo);
        fundInfo.setStockCode(stockInfo.getStockCode());
        fundInfo.setCreatedBy(operator);
        fundInfo.setUpdatedBy(operator);
        fundInfoDao.insertSelective(fundInfo);
    }

    @Override
    public PageResponseResult queryFundInfoListByDTO(FundInfoDTO fundInfoDTO) {
        Integer page = fundInfoDTO.getPage();
        if (fundInfoDTO.getPage() == null || fundInfoDTO.getPageSize() == null) {
            throw new BussException("非法入参");
        }
        if (page > 0) {
            fundInfoDTO.setStartNum((page - 1) * fundInfoDTO.getPageSize());
        } else {
            fundInfoDTO.setStartNum(0);
        }

        List<FundInfoDTO> fundInfoDTOList = fundInfoDao.selectByFundInfoDTO(fundInfoDTO);
        int total = fundInfoDao.selectTotalByFundInfoDTO(fundInfoDTO);
        return new PageResponseResult(total, fundInfoDTOList);
    }

    @Override
    public List<String> queryFundNameGroupList() {
        return fundInfoDao.queryFundNameGroupList();
    }

    @Override
    public void deleteFundInfo(int id) {
        fundInfoDao.deleteByPrimaryKey(id);
    }
}
