package com.kevin.learn.learn.arithmetic.sort.jike;

/**
 * @Description:反转单链表 两种 普通和递归
 * @Author: Kevin
 * @Create 2019-07-09 09:24
 */
public class ReverseList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        System.out.println(head);
        ListNode listNode = reverseListKevin2(head);
        System.out.println(listNode.next);
    }

    /**
     * Kevin自己研究明白写的反转 哈哈哈
     *
     * @param head
     * @return
     */
    public static ListNode reverseListKevin(ListNode head) {
        //定义一个空的节点
        ListNode prev = null;
        while (head != null) {
            //记录next的节点
            ListNode next = head.next;
            //反转
            head.next = prev;
            //移动prev指针
            prev = head;
            //移动head指针
            head = next;
            //注意最终的节点是prev 因为 prev.next=null 即head=null的时候,才能构成一个节点
        }
        return prev;
    }

    /**
     * 递归代码
     *
     * @param head
     * @return
     */
    public static ListNode reverseListKevin2(ListNode head) {
        //递归主要需要做好边界处理
        if (head == null || head.next == null) {
            return head;
        }
        //虚拟栈递归
        ListNode newHead = reverseListKevin2(head.next);
        //出栈倒序执行，用指针引用指向头尾相连，然后干掉原来的每个栈的首节点，则每个栈的首节点变为尾节点。
        head.next.next = head;
        head.next = null;
        //最后只需要返回新的节点就可以啦。
        return newHead;

    }

    /**
     * 反转链表 普通
     *
     * @param head
     * @return
     */
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

    /**
     * 反转链表 递归
     *
     * @param head
     * @return
     */
    public static ListNode reverseList2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }
}
