package com.kevin.learn.structures.all.demo6;

public class TestArrayBinaryTree {

	public static void main(String[] args) {
		int[] data = new int[] {1,2,3,4,5,6,7};
		ArrayBinaryTree tree = new ArrayBinaryTree(data);
		//前序遍历
		tree.frontShow();
	}

}
