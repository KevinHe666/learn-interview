package com.kevin.learn.learn.arithmetic.sort.jike;

import java.util.List;

/**
 * @Description:链表判断是否是回文
 * @Author: Kevin
 * @Create 2019-07-08 11:33
 */
public class PalindromeList {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(5);
        listNode.next = new ListNode(6);
        listNode.next.next = new ListNode(7);
        listNode.next.next.next = new ListNode(6);
        listNode.next.next.next.next = new ListNode(5);
        System.out.println(listNode.val);
        boolean palindrome2 = isPalindrome1(listNode);
        System.out.println(palindrome2);
    }

    public static boolean isPalindrome2(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        //慢指针
        ListNode slow = head;
        //快指针
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = head.next;
            fast = head.next.next;
        }
        ListNode reverseHead = reverseList(slow.next);
        while (head != null && reverseHead != null) {
            if (head.val != reverseHead.val) {
                return false;
            }
            head = head.next;
            reverseHead = reverseHead.next;
        }
        return true;
    }

    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode p = null;
        ListNode q;
        while (head != null) {
            q = head.next;
            head.next = p;
            p = head;
            head = q;
        }
        return p;
    }

    /**
     * 快慢指针判断是否是回文
     *
     * @param head
     * @return
     */
    public static boolean isPalindrome1(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode slow = head;
        ListNode fast = head;
        //找到中间结点
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode mid = slow.next;
        ListNode reviseroot = new ListNode(0);//定义一个虚结点来接受逆转后的头结点
        ListNode cur = reviseroot;//搬运结点。
        while (mid != null) {//开始逆转
            cur = mid;
            mid = mid.next;
            cur.next = null;
            cur.next = reviseroot.next;
            reviseroot.next = cur;
        }
        slow = head;
        fast = reviseroot.next;
        while (fast != null) {//进行比较
            if (fast.val != slow.val) {
                return false;
            }
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }


}
