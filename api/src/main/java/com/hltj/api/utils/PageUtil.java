package com.hltj.api.utils;


import com.hltj.api.domain.Pager;
import com.hltj.api.exception.BussException;

/**
 * @author zhangzedong
 * @version 1.0
 * @date 2021/4/10 10:06
 */
public class PageUtil{
    public static void resetDTOPage(Pager Object){
        Integer page = Object.getPage();
        if (Object.getPage() == null || Object.getPageSize() == null) {
            throw new BussException("非法入参");
        }
        if (page > 0) {
            Object.setStartNum((page - 1) * Object.getPageSize());
        } else {
            Object.setStartNum(0);
        }
    }
}
