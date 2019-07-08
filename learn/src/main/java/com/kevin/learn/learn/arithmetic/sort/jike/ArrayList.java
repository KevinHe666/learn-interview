package com.kevin.learn.learn.arithmetic.sort.jike;

import java.util.List;

/**
 * @Description:测试连表
 * @Author: Kevin
 * @Create 2019-07-07 20:17
 */
public class ArrayList {
    public static void main(String[] args) {
        List<Integer> list = new java.util.ArrayList<>(10);
        //设定好大小可以加快效率 如果设置超过100可以自动扩容
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list);
    }
}
