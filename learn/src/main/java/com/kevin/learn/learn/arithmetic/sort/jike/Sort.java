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

    /**
     * 快速排序
     * 从数列中挑出一个元素，称为 “基准”（pivot）;
     * <p>
     * 重新排序数列，所有元素比基准值小的摆放在基准前面，所有元素比基准值大的摆在基准的后面（相同的数可以到任一边）。
     * 在这个分区退出之后，该基准就处于数列的中间位置。这个称为分区（partition）操作；
     * <p>
     * 递归地（recursive）把小于基准值元素的子数列和大于基准值元素的子数列排序；
     *
     * @param a
     * @param left
     * @param right
     */
    public static void quickSort(int[] a, int left, int right) {
        //6 1 2 7 9 3 4 5 10 8
        //设定一个边界条件 就是当左的大于右边的就return
        if (left > right) {
            return;
        }
        //存放基准数 可以是左边界或者右边界
        int tmp = a[left];


    }

    public static void bubbleSort2(int[] a, int n) {
        if (n <= 1) {
            return;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] < a[j + 1]) {
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
