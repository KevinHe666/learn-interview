package com.kevin.learn.learn.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


/**
 * @Description:拦截器 2.x之前的是extends WebMvcConfigurerAdapter 不推荐
 * 2.x之后是新的
 * Filter和Interceptor的执行顺序
 * <p>
 * 过滤前->拦截前->action执行->拦截后->过滤后
 * @Author: Kevin
 * @Create 2019-07-18 17:32
 */
@Configuration
public class CustomWebMvcConfigurer implements WebMvcConfigurer{
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //拦截的指定路径 /*/**拦截全部
        registry.addInterceptor(new LoginIntercepter()).addPathPatterns("/api2/*/**");
        //.excludePathPatterns("/api2/123/**") 放行的地址
        //第二个拦截器
//        registry.addInterceptor(new TwoLoginIntercepter()).addPathPatterns("/api2/*/**");
        //最先进去最后执行 先是11 pre 2 pre 2 post 1post 2 1end 这是个list  List<InterceptorRegistration> registrations

    }
}
