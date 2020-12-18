package com.kevin.learn.structures.array;

/**
 * @ClassName TwoSum2
 * @Description 两数之和 II - 输入有序数组
 * @Author Kevin
 * @Date 2020/12/10 8:59 上午
 * @Version 1.0
 **/
public class TwoSum2 {
    //给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。
    //
    //函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。
    //
    //说明:
    //
    //返回的下标值（index1 和 index2）不是从零开始的。
    //你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。
    //示例:
    //
    //输入: numbers = [2, 7, 11, 15], target = 9
    //输出: [1,2]
    //解释: 2 与 7 之和等于目标数 9 。因此 index1 = 1, index2 = 2 。
    //
    //作者：力扣 (LeetCode)
    //链接：https://leetcode-cn.com/leetbook/read/array-and-string/cnkjg/
    //来源：力扣（LeetCode）
    //著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        TwoSum2 twoSum2 = new TwoSum2();
        twoSum2.twoSum(nums, 9);
    }

    /**
     * 双指针
     *
     * @param numbers
     * @param target
     * @return
     */
    public int[] twoSum(int[] numbers, int target) {
        int low = 0, high = numbers.length - 1;
        while (low < high) {
            int sum = numbers[low] + numbers[high];
            if (sum == target) {
                return new int[]{low + 1, high + 1};
            } else if (sum < target) {
                ++low;
            } else {
                --high;
            }
        }
        return new int[]{-1, -1};

    }

}
