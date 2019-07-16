package com.kevin.learn.learn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description:
 * @Author: Kevin
 * @Create 2019-07-16 16:41
 */
@Controller
public class IndexController {

    /**
     * 测试映射页面
     *
     * @return
     */
    @RequestMapping(value = "/api/v1/index")
    public Object index() {
        return "index";
    }
}
