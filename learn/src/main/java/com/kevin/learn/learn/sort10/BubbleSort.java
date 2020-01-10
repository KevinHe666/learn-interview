package com.kevin.learn.learn.sort10;

import java.util.Arrays;

/**
 * @Description:冒泡排序 比较排序的一种
 * @Author: Kevin
 * @Create 2019-12-14 09:24
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] testArray = {6, 9, 1, 0, 6, 5, 4, 3, 2, 10};
        System.out.println(Arrays.toString(bubbleSort(testArray)));
    }

    public static int[] bubbleSort(int[] array) {
        if (array.length == 0) {
            return array;
        }
        //比较相邻的元素如果第一个比第二个大就交换
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                //小于是从小到大 大于是从大到小
                if (array[j + 1] < array[j]) {
                    int tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
        return array;
    }
}
