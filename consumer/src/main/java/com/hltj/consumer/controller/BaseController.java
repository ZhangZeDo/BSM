package com.hltj.consumer.controller;

import com.hltj.api.domain.TUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.FileCopyUtils;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.FileInputStream;
import java.net.URLEncoder;

public class BaseController {
    private Logger logger = LoggerFactory.getLogger(BaseController.class);

    public String getOperator(HttpServletRequest request){
        HttpSession session = request.getSession();
        TUser user = (TUser) session.getAttribute("userInfo");
        return user.getUserId();
    }

    public void downloadFile(String fileUrl,String fileName,HttpServletResponse response){
        try {
            response.setCharacterEncoding("utf-8");
            response.setContentType("application/octet-stream");
            response.setHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode(fileName, "UTF-8"));
            //fileUrl = resetFileUrl(fileUrl);
            FileCopyUtils.copy(new FileInputStream(fileUrl), response.getOutputStream());
        } catch (Exception e) {
            logger.error("下载文件出现异常，异常信息为", e);
        }
    }

    private String resetFileUrl(String fileUrl){
        String baseUrl = "D:\\Program Files\\fileDepository\\";
        fileUrl = fileUrl.replace("http://129.204.251.179:8083/",baseUrl);
        fileUrl = fileUrl.replace("/","\\");
        return fileUrl;
    }
}