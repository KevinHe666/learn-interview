package com.kevin.learn.structures.all.demo1;

public class AddOneToHandred {

	public static void main(String[] args) {
		int total=0;
		int end=100;
		//使用for循环计算
		for(int i=1;i<=end;i++) {
			total+=i;
		}
		
		//直接计算
		total=(1+end)*end/2;
		//算法没有最好的，只有最适合的。
		
		//打印结果
		System.out.println(total);
	}
	
}
