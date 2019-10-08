package com.kevin.test.pojo;

import lombok.Data;

/**
 * @Description:UserPO
 * @Author: Kevin
 * @Create 2019-07-26 16:20
 */
@Data
public class UserPO {
    private Integer id;
    private String name;
    private int age;

    public UserPO(Integer id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
