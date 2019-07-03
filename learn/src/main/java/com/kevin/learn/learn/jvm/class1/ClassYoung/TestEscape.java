package com.kevin.learn.learn.jvm.class1.ClassYoung;

/**
 * @Description:逃逸
 * @Author: Kevin
 * @Create 2019-07-03 14:49
 */
public class TestEscape {
    public static Object obj;

    public void variableEscape() {
        obj = new Object();     //发生逃逸
    }

    public Object methodEscape() {
        return new Object();    //方法逃逸
    }

    public static void alloc() {
        byte[] b = new byte[2];
        b[0] = 1;
    }

    public static void main(String[] args) {
        //栈上分配 java8默认开启方法逃逸 速度很快 如果加上
        //-XX:-DoEscapeAnalysis 关闭的话 时间很长
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            alloc();
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);

    }
}
