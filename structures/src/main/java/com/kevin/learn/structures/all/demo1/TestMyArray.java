package com.kevin.learn.structures.all.demo1;


import com.kevin.learn.structures.all.demo1.util.MyArray;

public class TestMyArray {

	public static void main(String[] args) {
		//创建一个可变的数组
		MyArray ma = new MyArray();
		//获取长度
		int size = ma.size();
		ma.show();
		//往可变数组中添加一个元素
		ma.add(99);
		ma.add(98);
		ma.add(97);
		//显示可变数组中的所有元素到控制台
		ma.show();
		//删除某个元素
		ma.delete(1);
		ma.show();
		//取出指定位置的元素
		int element = ma.get(1);
		System.out.println(element);
		System.out.println("=====================");
		ma.add(96);
		ma.add(95);
		ma.add(94);
		ma.show();
		//插入元素到指定位置
		ma.insert(3, 33);
		ma.show();
		System.out.println("=====================");
		//替换指定位置的元素
		ma.set(-1, 100);
		ma.show();
		System.out.println(ma.size());
	}

}
