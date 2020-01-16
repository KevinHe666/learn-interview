package com.kevin.learn.structures.all.demo3;

import java.util.Arrays;

public class TestQuickSort {
	static  int x=0;
	
	
	public static void main(String[] args) {
		int[] array = new int[] {3,2,4,5,7,1,8,0};
		bubbleSort(array);
		System.out.println(Arrays.toString(array));
		System.out.println(x);
	}
	
	public static void bubbleSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				x++;
			}
		}
	}
	
	public static void quickSort(int[] array, int left, int right) {
	    if (left < right) {
	        int pivot = array[left];
	        int low = left;
	        int high = right;
	        while (low < high) {
	            while (low < high && array[high] >= pivot) {
	                high--;
	            }
	            array[low] = array[high];
	            while (low < high && array[low] <= pivot) {
	                low++;
	            }
	            array[high] = array[low];
	        }
	        array[low] = pivot;
	        quickSort(array, left, low - 1);
	        quickSort(array, low + 1, right);
	    }
	}

}
