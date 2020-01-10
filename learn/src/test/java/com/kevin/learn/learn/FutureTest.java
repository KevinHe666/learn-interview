package com.kevin.learn.learn;

import org.junit.Test;

import java.util.concurrent.*;

/**
 * @Description:
 * @Author: Kevin
 * @Create 2019-12-13 14:28
 */
public class FutureTest {
    @Test
    public void testFuture() throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<Object> future = executorService.submit(new Callable<Object>() {
            @Override
            public Object call() throws Exception {
                System.out.println("获取数据中,等待5秒");
                Thread.sleep(5000l);
                return "kevin test future";
            }
        });
        System.out.println("主线程继续执行....");

        System.out.println("获取到的数据: " + future.get());
    }
}
