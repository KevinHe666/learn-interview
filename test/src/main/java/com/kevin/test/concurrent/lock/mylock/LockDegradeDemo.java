package com.kevin.test.concurrent.lock.mylock;

import java.util.concurrent.*;

/**
 * @Description:锁降级Demo
 * @Author: Kevin
 * @Create 2019-12-22 09:54
 */
public class LockDegradeDemo {
    private int i = 0;
    public void doSomething() throws InterruptedException {
        i++;
        Thread.sleep(2000L);
        //模拟复杂操作
        if (i == 1) {
            System.out.println("i的值是======>1");
        } else {
            System.out.println("id值是 " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        LockDegradeDemo lockDegradeDemo = new LockDegradeDemo();
        lockDegradeDemo.doSomething();
    }
}
