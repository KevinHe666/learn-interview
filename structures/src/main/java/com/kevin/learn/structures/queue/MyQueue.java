package com.kevin.learn.structures.queue;

/**
 * @Description Queue 队列底层还是数组实现
 * @Author Kevin
 * @Date 2020-01-15 16:34
 * @Version V1.0
 **/
public class MyQueue {
    int[] elements;

    public MyQueue() {
        elements = new int[0];
    }

    /**
     * 入队操作
     *
     * @param element
     */
    public void add(int element) {
        int newArr[] = new int[elements.length + 1];
        for (int i = 0; i < elements.length; i++) {
            newArr[i] = elements[i];
        }
        newArr[elements.length] = element;
        elements = newArr;
    }

    /**
     * 出队操作
     */
    public int poll() {
        //把数组中第一个元素取出来
        int element = elements[0];
        int[] newArr = new int[elements.length - 1];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = elements[i];
        }
        elements = newArr;
        return element;
    }
}
