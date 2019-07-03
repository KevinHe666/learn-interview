package com.kevin.learn.learn.jvm.class1.ClassYoung;

/**
 * @Description: 测试大对象
 * @Author: Kevin
 * @Create 2019-07-03 11:02
 */
public class TestMaxObject {
    public static void main(String[] args) {
        //10M的大对象 直接在老年代分配 1M老年代没分配
        byte[] bytes = new byte[1024 * 1024 * 10];
    }
}
