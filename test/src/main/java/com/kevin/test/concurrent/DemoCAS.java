package com.kevin.test.concurrent;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * @Description:
 * @Author: Kevin
 * @Create 2019-12-31 16:53
 */
public class DemoCAS {
    int i = 0;
    //Unsafe unsafe = Unsafe.getUnsafe()//不能直接使用，需要通过反射来获取
    static Unsafe unsafe; // java 中操作内存的一个类
    static long valueOffset; //内存中的地址(偏移量)

    static {
        try {//通过反射机制去拿unsafe
            Field filed = Unsafe.class.getDeclaredField("theUnsafe"); //拿到theUnsafe
            filed.setAccessible(true);  //因为是私有，设置成可访问
            //拿到unsafe  参数是要传一个对象，因为是静态的，没有对象所以传Null
            unsafe = (Unsafe) filed.get(null);
            //通过数据去拿到内存中的i地址（偏移量）
            //直接操作内存，获取属性的偏移量（同它来定位对象内具体属性的内存地址）
            valueOffset = unsafe.objectFieldOffset(DemoCAS.class.getDeclaredField("i"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void incr() {
        //比较和替换
        int current = 0;//内存中的值,当前值
        do {
            current = unsafe.getIntVolatile(this, valueOffset); //获取当前内存中的值
        } while (!unsafe.compareAndSwapInt(this, valueOffset, current, current + 1));

    }

    public static void main(String[] args) {
        DemoCAS demo = new DemoCAS();
        for (int i = 0; i < 2; i++) {
            new Thread(() -> {
                for (int j = 0; j < 10000; j++) {
                    demo.incr();
                }
            }).start();
        }
        try {
            Thread.sleep(2000);
            System.out.println("i=" + demo.i);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
