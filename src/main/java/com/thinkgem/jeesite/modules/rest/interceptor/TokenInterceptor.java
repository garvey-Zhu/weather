package com.thinkgem.jeesite.modules.rest.interceptor;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2017/7/5.
 */
public class TokenInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
        //统一处理response的编码
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json;charset=utf-8");

        //验证token


        return false;
    }


}
