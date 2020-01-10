package com.kevin.test.concurrent.lock.mylock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * @Description:自己的锁实现
 * @Author: Kevin
 * @Create 2019-12-20 20:44
 */
public class MyLock implements Lock {
    /**
     * 是否持有这个锁
     */
    private boolean isHoldLock = false;
    /**
     * 持有线程
     */
    private Thread holdLockThread = null;
    /**
     * 可重入的次数
     */
    private int reentryCount = 0;

    /**
     * 同一时刻能且只能有一个线程获取到锁 其他线程只能等待该线程释放锁之后才能获取到锁
     */
    @Override
    public synchronized void lock() {
        if (isHoldLock && Thread.currentThread() != holdLockThread) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        holdLockThread = Thread.currentThread();
        isHoldLock = true;
        reentryCount++;
    }

    @Override
    public void lockInterruptibly() throws InterruptedException {

    }

    @Override
    public boolean tryLock() {
        return false;
    }

    @Override
    public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
        return false;
    }

    /**
     * 释放锁
     */
    @Override
    public synchronized void unlock() {
        //判断当前线程是否是持有锁的一个线程,是 重入次数-1 不是不做处理
        if (Thread.currentThread() == holdLockThread) {
            reentryCount--;
            if (reentryCount == 0) {
                notify();
                isHoldLock = false;
            }
        }

    }

    @Override
    public Condition newCondition() {
        return null;
    }
}
