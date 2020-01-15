package com.kevin.learn.structures.stack;

/**
 * @Description TODO
 * @Author Kevin
 * @Date 2020-01-15 11:21
 * @Version V1.0
 **/
public class TestMyStack {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(9);
        myStack.push(8);
        myStack.push(7);
        myStack.push(6);
//        int pop = myStack.pop();
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.peek());
        System.out.println(myStack.isEmpty());
    }
}
