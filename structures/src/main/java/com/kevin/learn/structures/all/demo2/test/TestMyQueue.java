package com.kevin.learn.structures.all.demo2.test;


import com.kevin.learn.structures.all.demo2.MyQueue;

public class TestMyQueue {

	public static void main(String[] args) {
		//创建一个队列
		MyQueue mq = new MyQueue();
		//入队
		mq.add(9);
		mq.add(8);
		mq.add(7);
		//出队
		System.out.println(mq.poll());
		mq.add(6);
		System.out.println(mq.poll());
		System.out.println(mq.poll());
		System.out.println(mq.isEmpty());
		System.out.println(mq.poll());
	}
	
}
