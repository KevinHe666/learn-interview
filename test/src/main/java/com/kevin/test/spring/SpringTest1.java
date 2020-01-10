package com.kevin.test.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description:
 * @Author: Kevin
 * @Create 2020-01-08 09:02
 */
public class SpringTest1 {
    public static void main(String[] args) {
//        初始化spring容器
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
    }
}
