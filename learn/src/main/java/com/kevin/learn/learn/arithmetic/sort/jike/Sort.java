package com.kevin.learn.learn.arithmetic.sort.jike;

import java.util.Arrays;

/**
 * @Description:排序练习
 * @Author: Kevin
 * @Create 2019-07-10 16:53
 */
public class Sort {
    public static void main(String[] args) {
        int[] a = {4, 5, 6, 3, 2, 1};
        int n = a.length;
        bubbleSort2(a, n);
        System.out.println(n);
        System.out.println(Arrays.toString(a));
    }

    public static void bubbleSort2(int[] a, int n) {
        if (n <= 1) {
            return;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if ( a[j]<a[j + 1]){
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }
            }
        }
    }

    /**
     * 从小到大排序
     *
     * @param a
     * @param n
     */
    public static void bubbleSort(int[] a, int n) {
        if (n <= 1) {
            return;
        }
        for (int i = 0; i < n; i++) {
            //标记是否有数据交换
            boolean flag = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    //交换
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                    //有数据交换
                    flag = true;
                }
            }
            //没有数据提前退出
            if (!flag) break;
        }
    }
}
