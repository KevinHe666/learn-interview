package com.kevin.learn.learn.jvm.class1;

/**
 * @Description:引用计数器GC 引用计数器无法检测循环引用 jdk8用的是不引用计数法˚
 * @Author: Kevin
 * @Create 2019-07-02 14:51
 */
public class ReferenceCountingGC {

    public Object instance = null;

    private static final int num = 1024 * 1024;
    private byte[] bigsIZE = new byte[2 * num];

    public static void main(String[] args) {
        //设置jmv参数 -verbose:gc --XX:+PrintGCDetails
        ReferenceCountingGC objA = new ReferenceCountingGC();
        ReferenceCountingGC objB = new ReferenceCountingGC();
        objA.instance = objB;
        objB.instance = objA;
        objA = null;
        objB = null;
        //引用计数器无法检测循环引用 他们的引用计数永远不可能为0.
        System.gc();
    }
}
