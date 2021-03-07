package com.hltj.provider.utils;


public class UniqIdUtil {
    public synchronized static String getUniqId(){
        long nowTime = System.currentTimeMillis();
        String time = String.valueOf(nowTime);
        if (time.length()>19){
            time = time.substring(0,18);
        }
        return time;
    }

}