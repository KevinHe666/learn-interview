package com.kevin.learn.learn.arithmetic.sort.jike.freetest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description:初级算法优化
 * @Author: Kevin
 * @Create 2019-07-11 10:48
 */
public class add {
    public static void main(String[] args) {
        //从1加到100000
//        long start = 1;
//        long end = 1000000000;
//        add1(start, end);
//        add2(start, end);
        //两数之和
        int[] num = {2, 7, 11, 15};
        int target = 9;
        final int[] ints = twoSum(num, target);
        System.out.println(Arrays.toString(ints));
    }

    public static void add1(long start, long end) {
        final long l = System.currentTimeMillis();
        long y = 0;
        for (long i = start; i <= end; i++) {
            y = y + i;
        }
        System.out.println(y);
        final long l1 = System.currentTimeMillis();
        System.out.println(l1 - l);
    }

    public static void add2(long start, long end) {
        final long l = System.currentTimeMillis();
        long y = 0;
        y = (end * (end + start)) / 2;
        System.out.println(y);
        final long l1 = System.currentTimeMillis();
        System.out.println(l1 - l);
    }

    /**
     * 斐波那契数组 1,1,2,3,5,8,13,21,34
     */
    public static int fbnq(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fbnq(n - 1) + fbnq(n - 2);
    }

    /**
     * 求两数之和
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        //暴力解法
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target) {
//                    return new int[]{i, j};
//                }
//            }
//        }
//        return new int[0];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
