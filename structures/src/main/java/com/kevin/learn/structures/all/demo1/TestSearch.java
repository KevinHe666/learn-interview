package com.kevin.learn.structures.all.demo1;

public class TestSearch {

	public static void main(String[] args) {
		//目标数组
		int[] arr = new int[] {2,3,5,6,8,4,9,0};
		//目标元素
		int target = 10;
		//目标元素所在的下标
		int index = -1;
		//遍历数组
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				index=i;
				break;
			}
		}
		//打印目标元素的下标
		System.out.println("index:"+index);
	}

}
