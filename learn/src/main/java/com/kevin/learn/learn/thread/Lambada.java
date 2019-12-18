package com.kevin.learn.learn.thread;

/**
 * @Description:Labada表达式创建一个线程
 * @Author: Kevin
 * @Create 2019-12-17 16:16
 */
public class Lambada {

    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
        }).start();
    }
}
