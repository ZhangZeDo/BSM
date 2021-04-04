package com.hltj.api.utils;

import com.hltj.api.exception.BussException;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author
 * @date
 * @describe
 */
public class FileUtil {
    public static String uploadFile(String fileSavePath, InputStream inputStream,String fileName){
        try {
            String result = "";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
            String date = simpleDateFormat.format(new Date());
            result = fileSavePath + "/" + date;
            simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
            String dateString = "_".concat(simpleDateFormat.format(new Date()));
            String name = "";
            int i = fileName.lastIndexOf(".");
            if (i == -1) {
                name = fileName.concat(dateString);
            } else {
                name = fileName.substring(0, i).concat(dateString).concat(fileName.substring(i, fileName.length()));
            }
            String routeDir = result+"/"+name;
            FileUtils.copyInputStreamToFile(inputStream, new File(routeDir));
            return routeDir;
        }catch (Exception e){
            throw new BussException("保存文件失败");
        }
    }
}
