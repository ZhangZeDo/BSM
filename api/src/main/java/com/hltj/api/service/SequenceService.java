package com.hltj.api.service;

import com.hltj.api.exception.BussException;
import org.apache.commons.lang3.StringUtils;

/**
 * @author zhangzedong
 * @version 1.0
 * @date 2021/2/27 12:38
 */
public interface SequenceService {
    int getSequenceValue(String sequenceName);

    String getBussId(String sequenceName,String prefix);
}
