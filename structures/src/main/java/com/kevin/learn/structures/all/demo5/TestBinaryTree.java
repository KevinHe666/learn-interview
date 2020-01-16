package com.kevin.learn.structures.all.demo5;

public class TestBinaryTree {

	public static void main(String[] args) {
		//创建一颗树
		BinaryTree binTree = new BinaryTree();
		//创建一个根节点
		Node root = new Node(1);
		//把根节点赋给树
		binTree.setRoot(root);
		//创建一个左节点
		Node rootL = new Node(2);
		//把新创建的节点设置为根节点的子节点
		root.setLeftNode(rootL);
		//创建一个右节点
		Node rootR = new Node(3);
		//把新创建的节点设置为根节点的子节点
		root.setRightNode(rootR);
		//为第二层的左节点创建两个子节点
		rootL.setLeftNode(new Node(4));
		rootL.setRightNode(new Node(5));
		//为第二层的右节点创建两个子节点
		rootR.setLeftNode(new Node(6));
		rootR.setRightNode(new Node(7));
		//前序遍历树
		binTree.frontShow();
		System.out.println("===============");
		//中序遍历
		binTree.midShow();
		System.out.println("===============");
		//后序遍历
		binTree.afterShow();
		System.out.println("===============");
		//前序查找
		Node result = binTree.frontSearch(5);
		System.out.println(result);
		
		System.out.println("===============");
		//删除一个子树
		binTree.delete(4);
		binTree.frontShow();
		
	}

}
