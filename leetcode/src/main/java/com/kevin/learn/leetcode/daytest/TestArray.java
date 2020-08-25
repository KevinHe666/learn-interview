package com.kevin.learn.leetcode.daytest;

public class TestArray {

	public static void main(String[] args) {
		//创建一个数组
		int[] arr1 = new int[3];
		//获取数组长度
		int length1 = arr1.length;
		System.out.println("arr1's length"+length1);
		//访问数组中的元素:数组名[下标]  注意：下标从0开始,最大可以取到长度-1
		int element0 = arr1[0];
		System.out.println("element0:"+element0);
		//为数组中的元素赋值
		arr1[0]=99;
		System.out.println("element0:"+arr1[0]);
		arr1[1]=98;
		arr1[2]=97;
		//遍历数组
		for(int i=0;i<length1;i++) {
			System.out.println("arr1 element"+i+":"+arr1[i]);
		}
		//创建数组的同时为数组中的元素赋值
		int[] arr2 = new int[] {90,80,70,60,50};
		//获取数组的长度
		System.out.println("arr2 length："+arr2.length);
	}

}
