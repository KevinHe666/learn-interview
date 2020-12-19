package com.kevin.learn.leetcode.tree;

/**
 * @ClassName TestBinaryTree
 * @Description Test Tree
 * @Author Kevin
 * @Date 2020/9/8 5:02 下午
 * @Version
 */
public class TestBinaryTree {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        //创建一个根节点
        TreeNode root = new TreeNode(1);
        //把根节点赋给树
        binaryTree.setRoot(root);
    }
}
