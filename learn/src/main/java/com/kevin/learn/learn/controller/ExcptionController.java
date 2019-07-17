package com.kevin.learn.learn.controller;

import com.kevin.learn.learn.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @Description:异常测试
 * @Author: Kevin
 * @Create 2019-07-17 16:57
 */
@RestController
public class ExcptionController {
    @RequestMapping("/api/v1/text_excption")
    public Object excption() {
        //不友好的异常
        int s = 1 / 0;
        return new User(11, "123123", "100000", new Date());
    }
}
