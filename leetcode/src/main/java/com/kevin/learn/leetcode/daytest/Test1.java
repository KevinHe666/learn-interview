package com.kevin.learn.leetcode.daytest;

/**
 * @ClassName Test1
 * @Description TODO
 * @Author Kevin
 * @Date 2020/7/23 9:07 上午
 * @Version
 */
public class Test1 {
    public static void main(String[] args) {
        int[] numbers = new int[]{2, 7, 11, 15};
        int target = 9;
        twoSum(numbers, target);
    }

    public static int[] twoSum(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length - 1;

        while (low < high) {
            int sum = numbers[low] + numbers[high];
            if (sum == target) {
                System.out.println("找到符合条件的 sum值 " + sum + " 下标是: " + low + " , " + high);
                return new int[]{low + 1, high + 1};
            } else if (sum < target) {
                low++;
            } else {
                high--;
            }
        }

        return new int[]{-1, -1};
    }
}
