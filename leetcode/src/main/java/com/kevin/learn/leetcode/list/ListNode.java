package com.kevin.learn.leetcode.list;


import lombok.Data;

/**
 * @Description:链表节点
 * @Author: Kevin
 * @Create 2019-12-31 09:00
 */
@Data
public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        this.val = x;
    }
}
