package com.kevin.learn.learn.jvm.class1.ClassYoung;

/**
 * @Description:
 * @Author: Kevin
 * @Create 2019-07-03 10:43
 */
public class TestJvmFirst {
    /**
     * 1M内存
     */
    private static final int byteSize = 1024 * 1024;

    public static void main(String[] args) {
        //40M PS 并行垃圾收集器 默认df 串行垃圾收集器 serial 都是有限再eden优先分配
        byte[] bytes = new byte[40 * byteSize];

    }
}
