package com.kevin.learn.leetcode.daytest;

/**
 * @ClassName Test2
 * @Description TODO
 * @Author Kevin
 * @Date 2020/9/2 4:07 下午
 * @Version
 */
public class Test2 {
    public static void main(String[] args) {
        m(9);
    }

    private static void m(int i) {
        if (i == 1) {
            System.out.println("1*1=1");
        } else {
            m(i - 1);
            for (int j = 1; j <= i; j++) {
                System.out.println(i + "*" + j + "=" + (i * j) + "");
            }

        }
    }
}
