package com.kevin.learn.learn.thread;

/**
 * @Description:
 * @Author: Kevin
 * @Create 2019-12-17 15:32
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.setName("线程Demo");
        myThread.start();
    }
}
