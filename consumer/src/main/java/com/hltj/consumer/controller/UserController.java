package com.hltj.consumer.controller;

import com.alibaba.druid.support.json.JSONUtils;
import com.alibaba.dubbo.common.json.JSON;
import com.hltj.api.domain.TUser;
import com.hltj.api.dto.ResponseResult;
import com.hltj.api.exception.BussException;
import com.hltj.api.service.UserService;
import com.sun.xml.internal.rngom.parse.host.Base;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @author zhangzedong
 * @version 1.0
 * @date 2021/2/27 16:16
 */
@RestController
@RequestMapping("/user")
public class UserController extends BaseController {
    private Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Resource
    private UserService userService;

    @RequestMapping(value = "insertUser",method = RequestMethod.POST)
    @ResponseBody
    public Object insertUser(@RequestBody TUser user, HttpServletRequest request) {
      try {
        logger.info("开始执行新增用户信息操作"+ JSONUtils.toJSONString(user));
        String operator = getOperator(request);
        userService.insertUser(user,operator);
        return ResponseResult.success();
      }catch (BussException bse){
          return ResponseResult.error(bse.getMessage());
      }catch (Exception e){
          logger.error("新增用户信息失败，原因：",e);
          return ResponseResult.error("新增失败");
      }
    }
}
