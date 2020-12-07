package com.kevin.learn.leetcode.tree;

/**
 * @ClassName TreeNode
 * @Description 树的每个节点
 * @Author Kevin
 * @Date 2020/9/8 5:20 下午
 * @Version
 */
public class TreeNode {
    //节点的权
    int value;
    //左子节点
    TreeNode leftNode;
    //右子节点
    TreeNode rightNode;

    public TreeNode(int value) {
        this.value = value;
    }

    //设置左节点
    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    //设置右节点
    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }
}
