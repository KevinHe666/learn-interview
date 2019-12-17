package com.kevin.learn.learn.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @Description:线程池创建
 * @Author: Kevin
 * @Create 2019-12-17 16:17
 */
public class ThreadPool {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(() -> {
            System.out.println(Thread.currentThread().getName());
        });
        Thread.sleep(5000);
        System.out.println("休眠五秒后直接退出");
        executorService.shutdown();
    }
}
