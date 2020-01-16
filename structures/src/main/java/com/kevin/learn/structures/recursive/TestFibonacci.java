package com.kevin.learn.structures.recursive;

/**
 * @Description 斐波那契
 * @Author Kevin
 * @Date 2020-01-16 16:59
 * @Version V1.0
 **/
public class TestFibonacci {
    public static void main(String[] args) {
        //斐波那契数列: 1 1 2 3 5 8 13 21 34 55
        int i = fibonacci(6);
        System.out.println(i);
    }

    /**
     * 打印第N项的斐波那契数列
     *
     * @param i
     * @return
     */
    public static int fibonacci(int i) {
        if (i == 1 || i == 2) {
            return 1;
        } else {
            return fibonacci(i - 1) + fibonacci(i - 2);
        }
    }
}
