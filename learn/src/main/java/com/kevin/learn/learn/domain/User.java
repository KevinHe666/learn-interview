package com.kevin.learn.learn.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;

/**
 * @Description:User 测试类
 * @Author: Kevin
 * @Create 2019-07-16 11:19
 */
@Data
public class User {
    private int id;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private int age;
    @JsonIgnore
    private String pwd;
    @JsonProperty("account")
    private String name;
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss", locale = "zh", timezone = "GMT+8")
    private Date createTime;
    private String phone;

//    public User(int age, String pwd, String name, Date createTime) {
//        this.age = age;
//        this.pwd = pwd;
//        this.name = name;
//        this.createTime = createTime;
//    }
}
