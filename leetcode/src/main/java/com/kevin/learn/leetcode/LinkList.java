package com.kevin.learn.leetcode;

import java.util.Iterator;

/**
 * 自定义链表
 */
public class LinkList<T> implements Iterable<T>{

    //头结点
    private Node head;
    //元素个数
    private int N;

    //头结点不存数据
    public LinkList() {
        this.head = new Node(null, null);
        N = 0;
    }
    //在队列尾部插入元素
    public void insert(T t) {
        //找到链表的最后一个元素
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        //创建新元素
        Node newNode = new Node(t, null);
        //让最后一个元素的next=新元素
        last.next = newNode;
        //数量+1
        N++;
    }
    //在队列的i位置插入元素
    public void insert(int i, T t) {
        //找到第i个元素的前一个元素
        Node pre = head;
        for (int index = 0; index < i; index++) {
            pre = pre.next;
        }
        //当前元素是
        Node curr = pre.next;
        //创建新元素
        Node newNode = new Node(t, null);
        //让前一个元素的next= 新元素
        pre.next = newNode;
        //让新元素的next = 当前元素
        newNode.next = curr;
        //数量+1
        N++;
    }
    //根据下表获取元素
    public T get(int i) {
        Node temp = head;
        for (int index = 0; index <= i; index++) {
            temp = temp.next;
        }
        return temp.item;
    }
    //获取元素的下标
    public int indexOf(T t) {
        Node temp  = head;
        for (int index = 0; temp.next != null; index++) {
            temp = temp.next;
            if (temp.item.equals(t)) {
                return index;
            }
        }
        return -1;
    }
    //删除某个元素
    public void  remove(T t) {
        //如果是空表 直接返回
        if (isEmpty()) {
            return;
        }
        //循环链表 找到第一个元素=t的前置节点
        Node temp = head;
        while (temp != null) {
            if (temp.next.item.equals(t)) {
                break;
            }
            temp = temp.next;
        }
        //让节点的前置节点的next= 当前节点的next节点
        Node curr = temp.next;
        Node next = curr.next;
        temp.next = next;

        //数量-1
        N--;
    }

    public boolean isEmpty() {
        return N == 0;
    }
    //整个链表反转
    public void reverse() {
        if (isEmpty()) {
            return;
        }
        reverse(head.next);
    }
    //从某个节点开始反转
    public Node reverse(Node curr) {
        //递归出口 链表的最后一个元素，只需让head.next=curr即可 并返回curr
        if (curr.next == null) {
            head.next = curr;
            curr.next = null;
            return curr;
        }
        //下一个返回的应该是链表反转后 当前节点的前置节点
        Node pre = reverse(curr.next);
        pre.next = curr;
        curr.next = null;
        return curr;
    }

    @Override
    public Iterator<T> iterator() {
        return new LIterator();
    }
    private class LIterator implements Iterator{

        Node node;


        public LIterator() {
            this.node = head;
        }

        @Override
        public boolean hasNext() {
            return node.next != null;
        }
        @Override
        public Object next() {
            node = node.next;
            return node.item;
        }
    }

    class Node{
        T item;
        Node next;

        public Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }
    }


    public static void main(String[] args) {
        LinkList<Integer> list = new LinkList<>();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+",");
        }
        System.out.println();
        System.out.println("第2个节点的元素是："+list.get(2));
        System.out.println("3所在的下标是："+list.indexOf(3));
        list.remove(3);

        list.reverse();
        System.out.println();
        System.out.println("--------------------");
        Iterator<Integer> iterator1 = list.iterator();
        while (iterator1.hasNext()) {
            System.out.print(iterator1.next()+",");
        }
    }
}
