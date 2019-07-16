package com.kevin.learn.learn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author: Kevin
 * @Create 2019-07-15 14:22
 */
@RestController
public class TestController {
    /**
     * 100M
     */
    private static final int SIZE = 1024 * 2024 * 100;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() throws InterruptedException {
        byte[] bytes = new byte[SIZE];
        Thread.sleep(100000);
        return "hello world";
    }

    @RequestMapping("/")
    @ResponseBody
    public Object test1() {
        return "hello world";
    }

    /**
     * 注解RestController就不用注解ResponseBody了
     *
     * @return
     */
    @RequestMapping("/test")
    public Map<String, String> testMap() {
        Map<String, String> map = new HashMap<>();
        map.put("name", "kevin");
        return map;
    }
}
