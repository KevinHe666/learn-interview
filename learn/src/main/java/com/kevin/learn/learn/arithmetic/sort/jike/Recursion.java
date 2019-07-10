package com.kevin.learn.learn.arithmetic.sort.jike;

/**
 * @Description: 递归学习
 * @Author: Kevin
 * @Create 2019-07-10 10:04
 */
public class Recursion {
    public static void main(String[] args) {

    }

    /**
     * 假如这里有 n 个台阶，每次你可以跨 1 个台阶或者 2 个台阶，
     * 请问走这 n 个台阶有多少种走法？如果有 7 个台阶，
     * 你可以 2，2，2，1 这样子上去，也可以 1，2，1，1，2
     * 这样子上去，总之走法有很多，那如何用编程求得总共有多少种走法呢？
     *
     */

    /**
     * 想知道自己座第几排 挨个问前一排 一直问到第一排
     *
     * @param n
     * @return
     */
    int f(int n) {
        if (n == 1) {
            return 1;
        } else {
            return f(n - 1) + 1;
        }
    }
}
