package com.kevin.learn.learn.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Description:自定义过滤器
 * @Author: Kevin
 * @Create 2019-07-18 16:15
 */
//@WebFilter(urlPatterns = "/api/*", filterName = "loginFilter")
public class LoginFilter implements Filter {
    /**
     * 容器加载的时候调用
     *
     * @param filterConfig
     * @throws ServletException
     */
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init loginFilter");
    }

    /**
     * 请求被拦截的时候进行调用
     *
     * @param servletRequest
     * @param servletResponse
     * @param filterChain
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("doFilter loginFilter");
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        String username = request.getParameter("username");
        if ("kevin".equals(username)) {
            //符合放行 可以做各种权限校验等等
            filterChain.doFilter(servletRequest, servletResponse);
        } else {
            //不符合跳转或者做其他操作
            response.sendRedirect("/index.html");
            return;
        }

    }

    /**
     * 容器被销毁的时候被调用
     */
    @Override
    public void destroy() {
        System.out.println("destroy loginFilter");
    }
}
