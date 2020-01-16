package com.kevin.learn.structures.all.demo2.test;


import com.kevin.learn.structures.all.demo2.MyStack;

public class TestMyStack {

	public static void main(String[] args) {
		//创建一个栈
		MyStack ms = new MyStack();
		//压入数组
		ms.push(9);
		ms.push(8);
		ms.push(7);
		//最出栈顶元素
		System.out.println(ms.pop());
		System.out.println(ms.pop());
		System.out.println(ms.pop());
		//查看栈顶元素
//		System.out.println(ms.peek());
		System.out.println(ms.isEmpty());
	}

}
