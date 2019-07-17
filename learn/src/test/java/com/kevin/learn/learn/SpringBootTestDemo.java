package com.kevin.learn.learn;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Description:单元测试类
 * @Author: Kevin
 * @Create 2019-07-17 15:37
 */
@RunWith(SpringRunner.class) //底层用junit SpringJunit4ClassRunner
@SpringBootTest(classes = {LearnApplication.class})//启动整个springboot工程
public class SpringBootTestDemo {
    @Test
    public void testOne() {
        System.out.println("test hello");
        //断言
        TestCase.assertEquals(1, 1);
    }

    @Test
    public void testTwo() {
        System.out.println("test hello2");
        //断言
        TestCase.assertEquals(1, 1);
    }

    @Before
    public void testBefore() {
        System.out.println("before");
    }

    @After
    public void testAfter() {
        System.out.println("after");
    }

}
