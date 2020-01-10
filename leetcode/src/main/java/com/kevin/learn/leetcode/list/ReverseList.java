package com.kevin.learn.leetcode.list;

/**
 * @Description:反转单链表 反转一个单链表。
 * <p>
 * 示例:
 * <p>
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 * @Author: Kevin
 * @Create 2019-12-31 08:59
 */
public class ReverseList {
    public static void main(String[] args) {
        //测试输入数据的链表
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);
        System.out.println(listNode);
        ListNode listNode1 = reverseList(listNode);
        System.out.println(listNode1);
    }

    /**
     * 在遍历列表时，将当前节点的 next 指针改为指向前一个元素。由于节点没有引用其上一个节点，因此必须事先存储其前一个元素。在更改引用之前，
     * 还需要另一个指针来存储下一个节点。不要忘记在最后返回新的头引用！
     * 时间复杂度：O(n)O(n)，假设 nn 是列表的长度，时间复杂度是 O(n)O(n)。
     * 空间复杂度：O(1)O(1)。
     *
     * @param head
     * @return
     */
    public static ListNode reverseList(ListNode head) {
        //前指针节点
        ListNode prev = null;
        //当前节点
        ListNode curr = head;
        //每次循环，都将当前节点指向它前面的节点，然后当前节点和前节点后移
        while (curr != null) {
            //临时节点，暂存当前节点的下一节点，用于后移
            ListNode nextTemp = curr.next;
            //将当前节点指向它前面的节点
            curr.next = prev;
            //前指针后移
            prev = curr;
            //当前指针后移
            curr = nextTemp;
        }
        return prev;

    }

}
