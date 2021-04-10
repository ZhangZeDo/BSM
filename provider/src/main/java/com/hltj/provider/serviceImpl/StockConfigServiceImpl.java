package com.hltj.provider.serviceImpl;

import com.hltj.api.dao.TStockConfigMapper;
import com.hltj.api.domain.TStockConfig;
import com.hltj.api.domain.TStockInfo;
import com.hltj.api.dto.PageResponseResult;
import com.hltj.api.dto.StockConfigDTO;
import com.hltj.api.exception.BussException;
import com.hltj.api.service.StockConfigService;
import com.hltj.api.utils.PageUtil;
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
 * @date 2021/4/10 9:56
 */
@Service("stockConfigService")
public class StockConfigServiceImpl implements StockConfigService {
    private Logger logger = LoggerFactory.getLogger(StockConfigServiceImpl.class);
    @Resource
    private TStockConfigMapper stockConfigDao;

    @Override
    public PageResponseResult queryStockConfigList(StockConfigDTO stockConfigDTO) {
        PageUtil.resetDTOPage(stockConfigDTO);
        List<StockConfigDTO> stockConfigDTOList = stockConfigDao.selectByStockConfigDTO(stockConfigDTO);
        int total = stockConfigDao.selectTotalByStockConfigDTO(stockConfigDTO);
        return new PageResponseResult(total, stockConfigDTOList);
    }

    @Override
    public void insertStockConfig(StockConfigDTO stockConfigDTO, String operator) {
        checkStockConfigParams(stockConfigDTO);
        TStockConfig stockConfig = new TStockConfig();
        BeanUtils.copyProperties(stockConfigDTO,stockConfig);
        stockConfig.setCreatedBy(operator);
        stockConfig.setUpdatedBy(operator);

        stockConfigDao.insertSelective(stockConfig);
    }

    @Override
    public void updateStockConfig(StockConfigDTO stockConfigDTO, String operator) {
        checkStockConfigParams(stockConfigDTO);
        TStockConfig stockConfig = new TStockConfig();
        BeanUtils.copyProperties(stockConfigDTO,stockConfig);
        stockConfig.setUpdatedBy(operator);

        stockConfigDao.updateByPrimaryKeySelective(stockConfig);
    }

    @Override
    public void deleteStockConfig(int key) {
        stockConfigDao.deleteByPrimaryKey(key);
    }

    //检查参数是否正常
    private void checkStockConfigParams(StockConfigDTO stockConfigDTO){
        if (StringUtils.isBlank(stockConfigDTO.getConfigName())){
            throw new BussException("模板名称不能为空");
        }
        if (StringUtils.isBlank(stockConfigDTO.getConfigCondition())){
            throw new BussException("模板筛选条件不能为空");
        }
        if (StringUtils.isBlank(stockConfigDTO.getConfigContent())){
            throw new BussException("模板大新点评不能为空");
        }
    }
}
