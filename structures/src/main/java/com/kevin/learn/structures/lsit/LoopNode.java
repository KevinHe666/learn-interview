package com.kevin.learn.structures.lsit;

/**
 * @Description 循环单链表
 * @Author Kevin
 * @Date 2020-01-16 14:20
 * @Version V1.0
 **/
public class LoopNode {
    //节点内容
    int data;
    //下一个节点 循环链表的特点就是这个
    LoopNode next = this;

    public LoopNode(int data) {
        this.data = data;
    }
}
