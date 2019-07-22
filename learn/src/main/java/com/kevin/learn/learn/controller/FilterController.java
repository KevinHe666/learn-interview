package com.kevin.learn.learn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author: Kevin
 * @Create 2019-07-18 16:30
 */
@RestController
public class FilterController {
    private Map<String, Object> params = new HashMap<>();

    /**
     * 功能描述:测试GetMapping
     *
     * @return
     */
    @GetMapping(value = "/api/v1/filter")
    public Object pageUser(HttpServletRequest request) {
        params.clear();
        params.put("username", request.getParameter("username"));
        System.out.println("111热部署222HAHAH");
        return params;
    }
}
