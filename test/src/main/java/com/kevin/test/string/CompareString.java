package com.kevin.test.string;

/**
 * @Description:
 * @Author: Kevin
 * @Create 2019-12-17 15:09
 */
public class CompareString {
    public static void main(String[] args) {
        String a = "abc";
        String b = "abc";
        System.out.println(a == b);
        System.out.println(a.equals(b));

        Long l1 = 123L;
        Long l2 = 123L;
        System.out.println(l1 == l2);

        Long l3 = 127L;
        Long l4 = 127L;
        System.out.println(l3 == l4);
    }
}
