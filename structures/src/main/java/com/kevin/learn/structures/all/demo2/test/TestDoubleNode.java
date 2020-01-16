package com.kevin.learn.structures.all.demo2.test;


import com.kevin.learn.structures.all.demo2.DoubleNode;

public class TestDoubleNode {

	public static void main(String[] args) {
		//创建节点
		DoubleNode n1 = new DoubleNode(1);
		DoubleNode n2 = new DoubleNode(2);
		DoubleNode n3 = new DoubleNode(3);
		//追加节点
		n1.after(n2);
		n2.after(n3);
		//查看上一个，自己，下一个节点的内容
		System.out.println(n2.pre().getData());
		System.out.println(n2.getData());
		System.out.println(n2.next().getData());
		System.out.println(n3.next().getData());
		System.out.println(n1.pre().getData());
		
	}
	
}
