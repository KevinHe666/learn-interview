package com.kevin.learn.structures.all.demo4;

import com.kevin.learn.structures.all.demo2.MyQueue;

import java.util.Arrays;


public class RadixQueueSort {

	public static void main(String[] args) {
		int[] arr = new int[] {23,6,189,45,9,287,56,1,798,34,65,652,5};
		radixSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void  radixSort(int[] arr) {
		//存最数组中最大的数字
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		//计算最大数字是几位数
		int maxLength = (max+"").length();
		//用于临时存储数据的队列的数组
		MyQueue[] temp = new MyQueue[10];
		//为队列数组赋值
		for(int i=0;i<temp.length;i++) {
			temp[i]=new MyQueue();
		}
		//根据最大长度的数决定比较的次数
		for(int i=0,n=1;i<maxLength;i++,n*=10) {
			//把每一个数字分别计算余数
			for(int j=0;j<arr.length;j++) {
				//计算余数
				int ys = arr[j]/n%10;
				//把当前遍历的数据放入指定的队列中
				temp[ys].add(arr[j]);
			}
			//记录取的元素需要放的位置
			int index=0;
			//把所有队列中的数字取出来
			for(int k=0;k<temp.length;k++) {
				//循环取出元素
				while(!temp[k].isEmpty()) {
					//取出元素
					arr[index] = temp[k].poll();
					//记录下一个位置
					index++;
				}
			}
		}
	}
	
}
