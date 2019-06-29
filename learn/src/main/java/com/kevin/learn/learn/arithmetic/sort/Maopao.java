package com.kevin.learn.learn.arithmetic.sort;

/**
 * @Description:冒泡排序
 * @Author: Kevin
 * @Create 2019-06-29 23:05
 */
public class Maopao {
    /**
     * 冒泡排序
     *
     * @param arr
     */
    public static void bubbleSort(int[] arr) {
        //最外层循环
        for (int end = arr.length - 1; end > 0; end--) {
            //内层比较
            for (int i = 0; i < end; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }

        }

    }

    /**
     * 交换顺序
     *
     * @param arr
     * @param i
     * @param j
     */
    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;

    }
}
