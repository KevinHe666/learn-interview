package com.kevin.learn.learn.arithmetic.sort.jike;

/**
 * @Description: 判断是否是回文字符串 LRU淘汰算法
 * @Author: Kevin
 * @Create 2019-07-08 09:53
 */
public class Palindrome {
    /**
     * 回文字符串
     */
    private static String string = "A man, a plan, a canal: Panama";
    /**
     * 非回文字符串
     */
    private static String unString = "bhhudsp";

    public static void main(String[] args) {
        System.out.println(ifPalindrome2(string));
        System.out.println(ifPalindrome2(unString));
    }

    /**
     * 第一种最笨的方法 O(n)
     * 转化数组然后对应位置去对比
     *
     * @param str
     * @return
     */
    public static boolean ifPalindrome1(String str) {
        str = str.replaceAll("[\\p{Punct}\\p{Space}]+", "").toLowerCase();
        System.out.println(str);
        int times = str.length() / 2;
        int length = str.length();
        for (int i = 0; i < times; i++) {
            if (str.toCharArray()[i] != str.toCharArray()[length - i - 1]) {
                return false;
            }
        }
        return true;
    }

    /**
     * 双指针法
     *
     * @param s
     * @return
     */
    public static boolean ifPalindrome2(String s) {
        if (s == null) {
            return false;
        }
        if (s.length() == 0) {
            return true;
        }
        //前指针
        int i = 0;
        //后指针
        int j = s.length() - 1;
        while (i < j) {
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) i++;
            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) j--;
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) return false;
            i++;
            j--;
        }
        return true;
    }
}
