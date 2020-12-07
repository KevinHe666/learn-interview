package com.kevin.learn.structures.leetcode.test;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @ClassName: TwoSum
 * @Description 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 * 给定 nums = [2, 7, 11, 15], target = 9
 * <p>
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 * @Author Kevin
 * @Date 2020/10/20 20:52
 * @Version 1.0
 **/
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int[] ints = twoSum(nums, 9);
        System.out.println(Arrays.toString(ints));
    }

    /**
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        //暴力可以两次循环用hashmap也可以
        HashMap<Integer, Integer> map = new HashMap<>();
        //循环处理这个数组
        for (int i = 0; i < nums.length; i++) {
            //判断一下如果target-nums【i】的key存在map中
            if (map.containsKey(target - nums[i])) {
                //说明这个值已经存在并且这个值的下标符合前 i就是后面下标
                return new int[]{map.get(target - nums[i]), i};
            }
            //将nums的值和下标分别放入的key和value中
            map.put(nums[i], i);
        }
        //如果没有返回一个数
        return new int[]{-1};
    }
}
