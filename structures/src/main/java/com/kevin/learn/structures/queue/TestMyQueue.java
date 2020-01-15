package com.kevin.learn.structures.queue;

/**
 * @Description TODO
 * @Author Kevin
 * @Date 2020-01-15 18:09
 * @Version V1.0
 **/
public class TestMyQueue {
    public static void main(String[] args) {
        MyQueue mq=new MyQueue();
        mq.add(9);
        mq.add(8);
        mq.add(7);

        System.out.println(mq.poll());
    }
}
