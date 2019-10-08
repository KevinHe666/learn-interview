package com.kevin.test.concurrent;

/**
 * @Description:死锁Demo
 * @Author: Kevin
 * @Create 2019-08-02 15:47
 */
public class DeadlockDemo {
    //互相揪头发 你不放手我不放手
    private static final Object HAIR_A = new Object();
    private static final Object HAIR_B = new Object();

    public static void main(String[] args) {
        new Thread(() -> {
            synchronized (HAIR_A) {
                try {
                    Thread.sleep(50L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (HAIR_B) {
                    System.out.println("A成功的抓住了B的头发");
                }
            }
        }).start();

        new Thread(() -> {
            synchronized (HAIR_B) {
                try {
                    Thread.sleep(50L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (HAIR_A) {
                    System.out.println("B成功的抓住了A的头发");
                }
            }
        }).start();
    }
}
