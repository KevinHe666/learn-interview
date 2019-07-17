package com.kevin.learn.learn;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 * @Description:测试mockmvc类
 * @Author: Kevin
 * @Create 2019-07-17 15:47
 */
@RunWith(SpringRunner.class) //底层用junit SpringJunit4ClassRunner
@SpringBootTest(classes = {LearnApplication.class})//启动整个springboot工程
@AutoConfigureMockMvc//测试mvc注解
public class MockMvcTestDemo {

    @Autowired
    private MockMvc mockMvc;//客户端

    @Test
    public void apiTest() throws Exception {
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/test/home")).
                andExpect(MockMvcResultMatchers.status().isOk()).andReturn();
        int status = mvcResult.getResponse().getStatus();
        System.out.println(status);
    }

}
