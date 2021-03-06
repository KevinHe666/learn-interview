package com.kevin.test.concurrent;

import com.kevin.test.concurrent.lock.mylock.MyLock;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description:线程不安全操作代码示例
 * @Author: Kevin
 * @Create 2019-08-02 15:56
 */
public class UnSafeThread {

    private static int num = 0;

    private static CountDownLatch countDownLatch = new CountDownLatch(10);

    private static Lock reentrantLock=new ReentrantLock();

    private static Lock lock = new MyLock();

    /**
     * 每次调用的时候对这个num进行++的操作
     */
    public static void inCreate() {
        lock.lock();
        ;
        num++;
        lock.unlock();
    }

    public static void main(String[] args) {
        //启动是个线程并发
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                for (int j = 0; j < 100; j++) {
                    inCreate();
                    try {
                        Thread.sleep(10L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                countDownLatch.countDown();
            }).start();
        }
        while (true) {
            if (countDownLatch.getCount() == 0) {
                System.out.println(num);
                break;
            }
        }

    }
}
