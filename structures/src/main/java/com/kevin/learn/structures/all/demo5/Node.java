package com.kevin.learn.structures.all.demo5;

public class Node {
	//节点的权
	int value;
	//左儿子
	Node leftNode;
	//右儿子
	Node rightNode;
	
	public Node(int value) {
		this.value=value;
	}
	
	//设置左儿子
	public void setLeftNode(Node leftNode) {
		this.leftNode = leftNode;
	}
	//设置右儿子
	public void setRightNode(Node rightNode) {
		this.rightNode = rightNode;
	}
	
	//前序遍历
	public void frontShow() {
		//先遍历当前节点的内容
		System.out.println(value);
		//左节点
		if(leftNode!=null) {
			leftNode.frontShow();
		}
		//右节点
		if(rightNode!=null) {
			rightNode.frontShow();
		}
	}

	//中序遍历
	public void midShow() {
		//左子节点
		if(leftNode!=null) {
			leftNode.midShow();
		}
		//当前节点
		System.out.println(value);
		//右子节点
		if(rightNode!=null) {
			rightNode.midShow();
		}
	}

	//后序遍历
	public void afterShow() {
		//左子节点
		if(leftNode!=null) {
			leftNode.afterShow();
		}
		//右子节点
		if(rightNode!=null) {
			rightNode.afterShow();
		}
		//当前节点
		System.out.println(value);
	}

	//前序查找
	public Node frontSearch(int i) {
		Node target=null;
		//对比当前节点的值
		if(this.value==i) {
			return this;
		//当前节点的值不是要查找的节点
		}else {
			//查找左儿子
			if(leftNode!=null) {
				//有可能可以查到，也可以查不到，查不到的话，target还是一个null
				target = leftNode.frontSearch(i);
			}
			//如果不为空，说明在左儿子中已经找到
			if(target!=null) {
				return target;
			}
			//查找右儿子
			if(rightNode!=null) {
				target=rightNode.frontSearch(i);
			}
		}
		return target;
	}
	
	//删除一个子树
	public void delete(int i) {
		Node parent = this;
		//判断左儿子
		if(parent.leftNode!=null&&parent.leftNode.value==i) {
			parent.leftNode=null;
			return;
		}
		//判断右儿子
		if(parent.rightNode!=null&&parent.rightNode.value==i) {
			parent.rightNode=null;
			return;
		}
		
		//递归检查并删除左儿子
		parent=leftNode;
		if(parent!=null) {
			parent.delete(i);
		}
		
		//递归检查并删除右儿子
		parent=rightNode;
		if(parent!=null) {
			parent.delete(i);
		}
	}

}
