package com.hltj.consumer.controller;

import com.alibaba.druid.support.json.JSONUtils;
import com.hltj.api.domain.TUser;
import com.hltj.api.dto.CustomerDTO;
import com.hltj.api.dto.PageResponseResult;
import com.hltj.api.dto.ResponseResult;
import com.hltj.api.exception.BussException;
import com.hltj.api.service.CustomerService;
import com.hltj.api.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @author zhangzedong
 * @version 1.0
 * @date 2021/2/28 10:23
 */
@RestController
@RequestMapping("/customer")
public class CustomerController extends BaseController {
    private Logger logger = LoggerFactory.getLogger(CustomerController.class);

    @Resource
    private CustomerService customerService;

    @RequestMapping(value = "queryCustomerList",method = RequestMethod.POST)
    @ResponseBody
    public Object queryCustomerList(@RequestBody CustomerDTO customerDTO) {
        try {
            PageResponseResult responseResult = customerService.queryCustomerList(customerDTO);
            return ResponseResult.build(responseResult);
        }catch (BussException bse){
            return ResponseResult.error(bse.getMessage());
        }catch (Exception e){
            logger.error("查询客户列表信息失败，原因：",e);
            return ResponseResult.error("查询失败");
        }
    }
}
