package com.hltj.consumer.controller;

import com.hltj.api.service.BuyOutInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zhangzedong
 * @version 1.0
 * @date 2021/3/28 10:16
 */
@RestController
@RequestMapping("/buyOutInfo")
public class BuyOutInfoController extends BaseController {
    private Logger logger = LoggerFactory.getLogger(BuyOutInfoController.class);

    @Resource
    private BuyOutInfoService buyOutInfoService;
}
