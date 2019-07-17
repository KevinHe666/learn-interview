package com.kevin.learn.learn.domain;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:异常处理走到这里
 * @Author: Kevin
 * @Create 2019-07-17 17:02
 */
@ControllerAdvice
public class ExceptionTest {
    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public Object exception() {
        Map<String, String> map = new HashMap<>();
        map.put("status", "-1");
        return map;
    }
}
