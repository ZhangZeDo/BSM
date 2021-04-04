package com.hltj.consumer.constants;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author zhangzedong
 * @version 1.0
 * @date 2021/4/4 11:45
 */
@Component
public class ConsumerConstants {
    public static String moduleImageSavePath;

    @Value("${moduleImageSavePath}")
    public static void setModuleImageSavePath(String moduleImageSavePath) {
        ConsumerConstants.moduleImageSavePath = moduleImageSavePath;
    }
}
