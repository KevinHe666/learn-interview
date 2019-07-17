package com.kevin.learn.learn.domain;

import lombok.Data;

/**
 * @Description:自定义的异常类
 * @Author: Kevin
 * @Create 2019-07-17 17:08
 */
@Data
public class MyException extends RuntimeException {
    /**
     * 构造函数
     *
     * @param code
     * @param msg
     */
    public MyException(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    /**
     * 错误码
     */
    private String code;
    /**
     * 错误信息
     */
    private String msg;

    @Override
    public String toString() {
        return "MyException{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                '}';
    }

}
