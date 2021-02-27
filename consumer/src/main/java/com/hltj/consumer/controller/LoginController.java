package com.hltj.consumer.controller;

import com.hltj.api.domain.TUser;
import com.hltj.api.dto.ResponseResult;
import com.hltj.api.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author zhangzedong
 * @version 1.0
 * @date 2021/2/27 11:35
 */
@RestController
@RequestMapping("/login")
public class LoginController extends BaseController {
    private Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Resource
    private UserService userService;

    @RequestMapping(value = "login",method = RequestMethod.POST)
    @ResponseBody
    public Object login(@RequestBody TUser user, HttpServletRequest request) {
        try{
            TUser userFromDB = userService.queryUserByName(user.getUserName());
            if (userFromDB==null){
                return ResponseResult.error("用户不存在");
            }else if(!StringUtils.equals(user.getUserPasswd(),userFromDB.getUserPasswd())){
                return ResponseResult.error("用户密码错误");
            }
            HttpSession session = request.getSession();
            session.setAttribute("userInfo",user);
            return ResponseResult.build(user);
        }catch (Exception e){
            return ResponseResult.error(e.getMessage());
        }
    }

    @RequestMapping(value = "loginOut",method = RequestMethod.POST)
    @ResponseBody
    public Object loginOut(HttpServletRequest request) {
        try{
            HttpSession session = request.getSession();
            session.setAttribute("userInfo",null);
            return ResponseResult.ok();
        }catch (Exception e){
            return ResponseResult.error(e.getMessage());
        }
    }

    @RequestMapping(value = "getLoginInfo",method = RequestMethod.POST)
    @ResponseBody
    public Object getLoginInfo(HttpServletRequest request) {
        try{
            HttpSession session = request.getSession();
            TUser user = (TUser) session.getAttribute("userInfo");
            return ResponseResult.build(user);
        }catch (Exception e){
            return ResponseResult.error(e.getMessage());
        }
    }
}
