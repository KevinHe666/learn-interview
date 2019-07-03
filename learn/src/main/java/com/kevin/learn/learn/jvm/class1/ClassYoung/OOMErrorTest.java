package com.kevin.learn.learn.jvm.class1.ClassYoung;

/**
 * @Description:OOM error
 * @Author: Kevin
 * @Create 2019-07-03 17:53
 */
public class OOMErrorTest {
    public static void main(String[] args) {
        String name = "xdclass";
        for (int i = 0; i < 100000000; i++) {
            name += name;
        }
        System.out.println(name);
    }
}
