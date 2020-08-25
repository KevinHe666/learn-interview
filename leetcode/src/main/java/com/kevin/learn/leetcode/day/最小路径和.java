package com.kevin.learn.leetcode.day;

import java.util.Arrays;

/**
 * @ClassName 最小路径和
 * 给定一个包含非负整数的 m x n 网格，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。
 * 说明：每次只能向下或者向右移动一步。
 * 输入:
 * [
 * [1,3,1],
 * [1,5,1],
 * [4,2,1]
 * ]
 * 输出: 7
 * 解释: 因为路径 1→3→1→1→1 的总和最小。
 * @Description TODO
 * @Author Kevin
 * @Date 2020/7/23 9:31 上午
 * @Version
 */
public class 最小路径和 {
    public static void main(String[] args) {
        int[][] grid = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        for (int i = 0; i < 3; i++) {
            System.out.println(Arrays.toString(grid[i]));
        }
    }

    /**
     * 动态规划
     *
     * @param grid
     * @return
     */
    public static int minPathSum(int[][] grid) {

        return -1;
    }
}
