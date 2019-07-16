package com.kevin.learn.learn.arithmetic.sort.jike.freetest;

import java.util.Arrays;

/**
 * @Description:递归学习
 * @Author: Kevin
 * @Create 2019-07-12 09:03
 */
public class Recursive {
    public static void main(String[] args) {
        char[] charArray = {'a', 'b', 'c', 'd', 'e'};
        reverseStr(charArray);
        System.out.println(Arrays.toString(charArray));
    }

    public static void reverseStr(char[] s) {
        helper(0, s.length - 1, s);
    }

    private static void helper(int start, int end, char[] s) {
        if (start >= end) {
            return;
        }
        // swap between the first and the last elements.
        char tmp = s[start];
        s[start] = s[end];
        s[end] = tmp;

        helper(start + 1, end - 1, s);
    }
}
