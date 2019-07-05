package com.kevin.learn.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
@EnableAutoConfiguration
public class LearnApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnApplication.class, args);
    }

    private static Object lock1 = new Object();
    private static Object lock2 = new Object();

    class WaitCondition {
        boolean isOpen = false;

        public void setOpen() {
            isOpen = true;
        }
    }

    WaitCondition waitCondition = new WaitCondition();

    /**
     * 在springboot项目启动的时候所执行的方法
     * 在bean加载完但用户线程进来之前执行的方法
     */
    @PostConstruct
    public void deadLock() {
        new Thread(() -> {
            synchronized (lock1) {
                try {
                    System.out.println(Thread.currentThread().getName() + "得到lock1");
                    Thread.sleep(3000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                synchronized (lock2) {
                    System.out.println(Thread.currentThread().getName() + "得到lock2");
                }
            }
        }, "线程1").start();

        new Thread(() -> {
            synchronized (lock2) {
                try {
                    System.out.println(Thread.currentThread().getName() + "得到lock2");
                    Thread.sleep(3000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                synchronized (lock1) {
                    System.out.println(Thread.currentThread().getName() + "得到lock1");
                }
            }
        }, "线程2").start();
        new Thread(() -> {
            synchronized (lock2) {
                try {
                    System.out.println(Thread.currentThread().getName() + "得到lock2");
                    Thread.sleep(3000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                synchronized (lock1) {
                    System.out.println(Thread.currentThread().getName() + "得到lock1");
                }
            }
        }, "线程3").start();
        new Thread(() -> {
            synchronized (lock2) {
                try {
                    System.out.println(Thread.currentThread().getName() + "得到lock2");
                    Thread.sleep(3000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                synchronized (lock1) {
                    System.out.println(Thread.currentThread().getName() + "得到lock1");
                }
            }
        }, "线程4").start();
    }
}
