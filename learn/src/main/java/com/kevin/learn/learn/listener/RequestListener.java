package com.kevin.learn.learn.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * @Description:监听器 常用的监听器(常用的监听器 servletContextListener 、
 *httpSessionListener 、 servletRequestListener)
 * @Author: Kevin
 * @Create 2019-07-18 16:54
 */
@WebListener
public class RequestListener implements ServletRequestListener {

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        //在controller之后
        // TODO Auto-generated method stub
        System.out.println("======requestDestroyed========");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        //在controller之前
        System.out.println("======requestInitialized========");

    }
}