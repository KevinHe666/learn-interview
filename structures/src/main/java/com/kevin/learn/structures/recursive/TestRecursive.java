package com.kevin.learn.structures.recursive;

/**
 * @Description 递归
 * @Author Kevin
 * @Date 2020-01-16 16:46
 * @Version V1.0
 **/
public class TestRecursive {


    public static void main(String[] args) {
        print(10);
    }

    /**
     * 递归操作
     *
     * @param i
     */
    public static void print(int i) {
        if (i > 0) {
            System.out.println(i);
            print(i - 1);
        }

    }
}
