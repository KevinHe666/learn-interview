package com.kevin.test.testmapper;

import com.kevin.test.pojo.UserPO;

/**
 * @Description:
 * @Author: Kevin
 * @Create 2019-07-26 16:38
 */
public class TestOut {
    public static void main(String[] args) {
        MapperProxy mapperProxy = new MapperProxy();
        UserPOMapper mapper = mapperProxy.newInsstance(UserPOMapper.class);
        UserPO userPO = mapper.getUserById(1001);
        System.out.println("ID:" + userPO.getId());
        System.out.println("Name:" + userPO.getName());
        System.out.println("Age:" + userPO.getAge());
        System.out.println(mapper.toString());

    }
}
