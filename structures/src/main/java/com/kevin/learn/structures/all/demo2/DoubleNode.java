package com.kevin.learn.structures.all.demo2;

public class DoubleNode {
	//上一个节点
	DoubleNode pre=this;
	//下一个节点
	DoubleNode next=this;
	//节点数据
	int data;
	
	public DoubleNode(int data) {
		this.data=data;
	}
	
	//增节点
	public void after(DoubleNode node) {
		//原来的下一个节点
		DoubleNode nextNext = next;
		//把新节点做为当前节点的下一个节点
		this.next=node;
		//把当前节点做新节点的前一个节点
		node.pre=this;
		//让原来的下一个节点作新节点的下一个节点
		node.next=nextNext;
		//让原来的下一个节点的上一个节点为新节点
		nextNext.pre=node;
	}
	
	//下一个节点
	public DoubleNode next() {
		return this.next;
	}
	
	//上一个节点
	public DoubleNode pre() {
		return this.pre;
	}
	
	//获取数据
	public int getData() {
		return this.data;
	}
	
}
