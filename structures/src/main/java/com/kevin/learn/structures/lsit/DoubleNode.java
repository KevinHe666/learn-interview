package com.kevin.learn.structures.lsit;

/**
 * @Description 循环双链表
 * @Author Kevin
 * @Date 2020-01-16 14:24
 * @Version V1.0
 **/
public class DoubleNode {
    //上个节点
    DoubleNode pre = this;
    //下个节点
    DoubleNode next = this;
    //节点数据
    int data;

    public DoubleNode(int data) {
        this.data = data;
    }

    //增加节点
    public void after(DoubleNode node) {

    }
}
