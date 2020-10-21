package com.kevin.learn.structures.leetcode.test;

/**
 * @ClassName 724.寻找数组的中心索引
 * @Description 给定一个整数类型的数组 nums，请编写一个能够返回数组 “中心索引” 的方法。
 * <p>
 * 我们是这样定义数组 中心索引 的：数组中心索引的左侧所有元素相加的和等于右侧所有元素相加的和。
 * <p>
 * 如果数组不存在中心索引，那么我们应该返回 -1。如果数组有多个中心索引，那么我们应该返回最靠近左边的那一个。
 * 输入：
 * nums = [1, 7, 3, 6, 5, 6]
 * 输出：3
 * 解释：
 * 索引 3 (nums[3] = 6) 的左侧数之和 (1 + 7 + 3 = 11)，与右侧数之和 (5 + 6 = 11) 相等。
 * 同时, 3 也是第一个符合要求的中心索引。
 * 输入：
 * nums = [1, 2, 3]
 * 输出：-1
 * 解释：
 * 数组中不存在满足此条件的中心索引。
 * @Author Kevin
 * @Date 2020/10/21 4:52 下午
 * @Version
 */
public class 寻找数组的中心索引 {

    public static int pivotIndex(int[] nums) {
        if (nums == null || nums.length < 3) {
            return -1;
        }
        //总共
        int totalsum = 0;
        //左边的和
        int leftsum = 0;
        for (int i = 0; i < nums.length; i++) {
            totalsum += nums[i];
        }
        //左边的两倍和等于总的减去
        for (int p = 0; p < nums.length; p ++){
            if(2*leftsum == totalsum - nums[p])
                return p;
            leftsum += nums[p];
        }
        return -1;
    }
}
