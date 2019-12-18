package com.kevin.learn.learn.thread;

/**
 * @Description:
 * @Author: Kevin
 * @Create 2019-12-17 15:34
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.setName("线程Runnable");
        //一定要调用start方法去启动一个线程
        thread.start();
//        thread.run();

    }
}
