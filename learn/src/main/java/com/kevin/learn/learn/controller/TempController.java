package com.kevin.learn.learn.controller;

import com.kevin.learn.learn.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @Description:测试类型的Controller
 * @Author: Kevin
 * @Create 2019-07-16 11:04
 */
@RestController
public class TempController {

    @GetMapping(value = "/testjson")
//    public Object testjson() {
//        return new User(22, "123", "123", new Date());
//    }

    @RequestMapping("/test/home")
    public String home() {
        return "kevin";
    }
}
