package com.kevin.learn.learn.controller;

import com.kevin.learn.learn.domain.User;
import com.kevin.learn.learn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @Description:
 * @Author: Kevin
 * @Create 2019-07-19 16:39
 */
@RestController
@RequestMapping(value = "/api/v1/mysql/")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 测试数据库插入接口
     *
     * @return
     */
//    @RequestMapping(value = "add")
//    public Object add() {
//        User user = new User();
//        user.setAge(1);
//        user.setCreateTime(new Date());
//        user.setName("kk");
//        user.setPhone("123123");
//        userService.add(user);
//        return "ok";
//    }

    /**
     * 测试事物
     *
     * @return
     */
    @RequestMapping(value = "transac")
    public Object transac() {
        int id = userService.addCount();
        return "ok";
    }
}
