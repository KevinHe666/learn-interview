package com.kevin.learn.structures.sort;

import java.util.Arrays;

/**
 * @Description 冒泡排序
 * @Author Kevin
 * @Date 2020-01-21 15:15
 * @Version V1.0
 **/
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 7, 1, 3, 4, 8, 6, 9};
        System.out.println(Arrays.toString(arr));
        int[] ints = bubbleSort(arr);
        System.out.println(Arrays.toString(ints));
    }

    /**
     * 冒泡排序方法
     *
     * @param arr
     * @return
     */
    public static int[] bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        return arr;
    }
}
