package com.kevin.learn.learn.thread;

/**
 * @Description:匿名内部类的方式 实际上是一个Runnable
 * @Author: Kevin
 * @Create 2019-12-17 16:14
 */
public class Thread2 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        });
        thread.start();
    }
}
