package com.kevin.learn.structures.all.demo5;

public class BinaryTree {

	Node root;
	
	//设置根节点
	public void setRoot(Node root) {
		this.root = root;
	}
	
	//获取根节点
	public Node getRoot() {
		return root;
	}

	public void frontShow() {
		if(root!=null) {
			root.frontShow();
		}
	}

	public void midShow() {
		if(root!=null) {
			root.midShow();
		}
	}

	public void afterShow() {
		if(root!=null) {
			root.afterShow();
		}
	}

	public Node frontSearch(int i) {
		return root.frontSearch(i);
	}

	public void delete(int i) {
		if(root.value==i) {
			root=null;
		}else {
			root.delete(i);
		}
	}
	
}
