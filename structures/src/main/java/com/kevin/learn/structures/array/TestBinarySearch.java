package com.kevin.learn.structures.array;

/**
 * @Description Binary Search 二分法查找,查找的数组必须是有序的
 * @Author Kevin
 * @Date 2020-01-15 08:51
 * @Version V1.0
 **/
public class TestBinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        //返回target所在的下标
        int i = binarySearch(arr, 0);
        System.out.println("所要查找的元素的下标位置是: " + i);
    }

    /**
     * @param arr    目标数组
     * @param target 目标元素
     * @return
     */
    public static int binarySearch(int[] arr, int target) {

        //记录开始位置
        int begin = 0;
        //记录结束为止
        int end = arr.length - 1;
        //中间位置
        int mid = (begin + end) / 2;
        //记录目标的位置
        int index = -1;
        //开始循环查找
        while (true) {
            //有种情况没有这个元素容易进入死循环
            //开始位置在结束位置之后或者重合
            if (begin > -end) {
                return index;
            }
            if (arr[mid] == target) {
                index = mid;
                break;
            } else {
                //如果中间的小于目标值,向左侧移动
                if (arr[mid] > target) {
                    end = mid - 1;

                    //如果中间的大于目标值,向右侧移动
                } else {
                    begin = mid + 1;
                }
                //取出中间新的位置
                mid = (begin + end) / 2;
            }

        }
        return index;
    }
}
