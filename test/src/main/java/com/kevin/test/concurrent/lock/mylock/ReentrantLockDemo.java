package com.kevin.test.concurrent.lock.mylock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description:ReentrantLock源码剖析
 * @Author: Kevin
 * @Create 2019-12-21 10:46
 */
public class ReentrantLockDemo {
    public static void main(String[] args) {
        ReentrantLock reentrantLock = new ReentrantLock();
        reentrantLock.lock();
        reentrantLock.unlock();
    }
}
