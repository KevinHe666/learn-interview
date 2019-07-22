package com.kevin.learn.learn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;

import javax.servlet.MultipartConfigElement;

/**
 * @Description:
 * @Author: Kevin
 * @Create 2019-07-15 14:22
 */
@SpringBootApplication
@ServletComponentScan
@MapperScan(value = "com.kevin.learn.learn.mapper")
public class LearnApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnApplication.class, args);
    }


    @Bean
    public MultipartConfigElement multipartConfigElement() {
        MultipartConfigFactory factory = new MultipartConfigFactory();
        //单个文件最大
        factory.setMaxFileSize("10240KB"); //KB,MB
        /// 设置总上传数据总大小
        factory.setMaxRequestSize("1024000KB");
        return factory.createMultipartConfig();
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

//    /**
//     * 在springboot项目启动的时候所执行的方法
//     * 在bean加载完但用户线程进来之前执行的方法
//     */
//    @PostConstruct
//    public void deadLock() {
//        new Thread(() -> {
//            synchronized (lock1) {
//                try {
//                    System.out.println(Thread.currentThread().getName() + "得到lock1");
//                    Thread.sleep(3000);
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//                synchronized (lock2) {
//                    System.out.println(Thread.currentThread().getName() + "得到lock2");
//                }
//            }
//        }, "线程1").start();
//
//        new Thread(() -> {
//            synchronized (lock2) {
//                try {
//                    System.out.println(Thread.currentThread().getName() + "得到lock2");
//                    Thread.sleep(3000);
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//                synchronized (lock1) {
//                    System.out.println(Thread.currentThread().getName() + "得到lock1");
//                }
//            }
//        }, "线程2").start();
//        new Thread(() -> {
//            synchronized (lock2) {
//                try {
//                    System.out.println(Thread.currentThread().getName() + "得到lock2");
//                    Thread.sleep(3000);
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//                synchronized (lock1) {
//                    System.out.println(Thread.currentThread().getName() + "得到lock1");
//                }
//            }
//        }, "线程3").start();
//        new Thread(() -> {
//            synchronized (lock2) {
//                try {
//                    System.out.println(Thread.currentThread().getName() + "得到lock2");
//                    Thread.sleep(3000);
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//                synchronized (lock1) {
//                    System.out.println(Thread.currentThread().getName() + "得到lock1");
//                }
//            }
//        }, "线程4").start();
//
//    }
//
//    @PostConstruct
//    public void visualVm() throws InterruptedException {
//        Map<Integer, Integer> map = new HashMap();
//        int i = 0;
//        for (int j = 0; j < 1000; j++) {
//            Thread.sleep(100000);
//            while (i < 2000000) {
//                i++;
//                try {
//                    map.put(i, i);
//                } catch (OutOfMemoryError e) {
//                    e.printStackTrace();
//                    break;
//                }
//            }
//        }
//    }
}
