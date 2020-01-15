package com.kevin.learn.structures.stack;

/**
 * @Description 栈的实现 用数组实现 入栈出栈
 * @Author Kevin
 * @Date 2020-01-15 11:12
 * @Version V1.0
 **/
public class MyStack {
    int[] elements;

    public MyStack() {
        elements = new int[0];
    }

    /**
     * 压入元素 就是数组增加的add方法
     *
     * @param element
     */
    public void push(int element) {
        //创建一个新的数组
        int[] newArr = new int[elements.length + 1];
        //把原数组中的元素复制到新数组中
        for (int i = 0; i < elements.length; i++) {
            newArr[i] = elements[i];
        }
        //把添加的元素放入新数组中
        newArr[elements.length] = element;
        //使用新数组替换旧的数组
        elements = newArr;
    }

    /**
     * 取出栈顶元素
     *
     * @return
     */
    public int pop() {
        //栈中没有元素抛异常
        if (elements.length == 0) {
            throw new RuntimeException("stack is empty");
        }
        //取出最后一个元素
        int element = elements[elements.length - 1];
        //需要创建新的数组
        int[] newArr = new int[elements.length - 1];
        //原数组中除了最后的元素都放入到新的数组中
        for (int i = 0; i < elements.length - 1; i++) {
            newArr[i] = elements[i];
        }
        //替换数组
        elements = newArr;
        //返回栈顶元素
        return element;
    }

    /**
     * 查看栈顶元素
     *
     * @return
     */
    public int peek() {
        //栈中没有元素抛异常
        if (elements.length == 0) {
            throw new RuntimeException("stack is empty");
        }
        return elements[elements.length - 1];
    }

    /**
     * 判断栈是否为空
     *
     * @return
     */
    public boolean isEmpty() {
        return elements.length == 0;
    }
}
