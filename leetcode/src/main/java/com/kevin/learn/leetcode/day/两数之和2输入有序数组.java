package com.kevin.learn.leetcode.day;

/**
 * @ClassName 两数之和
 * @Description leetcode 167.两数之和2-输入有序数组
 * 给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。
 * <p>
 * 函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。
 * <p>
 * 说明:
 * <p>
 * 返回的下标值（index1 和 index2）不是从零开始的。
 * 你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Author Kevin
 * @Date 2020/7/21 8:38 上午
 * @Version
 */
public class 两数之和2输入有序数组 {
    public static void main(String[] args) {
        int[] numbers = new int[]{2, 7, 11, 15};
        int target = 9;
        System.out.println("numbers的length是: " + numbers.length);
        twoSum(numbers, target);
        twoSum2(numbers, target);
    }

    /**
     * 二分法 总时间复杂度是 O(nlogn) 优于暴力法 少于双指针
     *
     * @param numbers
     * @param target
     * @return
     */
    public static int[] twoSum2(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            int low = i + 1, high = numbers.length - 1;
            while (low <= high) {
                int mid = (high - low) / 2 + low;
                if (numbers[mid] == target - numbers[i]) {
                    return new int[]{i + 1, mid + 1};
                } else if (numbers[mid] > target - numbers[i]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        //没有匹配到
        return new int[]{-1, -1};
    }

    /**
     * 双指针法 时间复杂度是O(n)
     *
     * @param numbers
     * @param target
     * @return
     */
    public static int[] twoSum(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length - 1;
        //前置条件 必须low<high
        while (low < high) {
            //求两个指针下标对应数的和
            int sum = numbers[low] + numbers[high];
            if (sum == target) {
                //输出是从1开始计算的 并非下标是从0计算
                System.out.println("找到符合条件的 sum值 " + sum + " 下标是: " + low + " , " + high);
                return new int[]{low + 1, high + 1};
            } else if (sum < target) {
                low++;
            } else {
                --high;
            }
        }
        //没有匹配到
        return new int[]{-1, -1};
    }
}
