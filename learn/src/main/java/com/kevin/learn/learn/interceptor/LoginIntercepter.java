package com.kevin.learn.learn.interceptor;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description:登录拦截器
 * @Author: Kevin
 * @Create 2019-07-18 17:38
 */
public class LoginIntercepter implements HandlerInterceptor {
    /**
     * 调用方法之前 login方法controller
     *
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("LoginIntercepter--------->preHandle");
        String access_token = request.getParameter("access_token");
        if (StringUtils.isBlank(access_token)) {
            response.getWriter().print("false");
        }

        return false;
    }

    /**
     * 调用方法之后,视图渲染之前
     *
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("LoginIntercepter--------->postHandle");
    }

    /**
     * 整个完成之后,通常用于资源清理
     *
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("LoginIntercepter--------->afterCompletion");
    }
}
