package com.kevin.learn.learn.service.impl;

import com.kevin.learn.learn.domain.User;
import com.kevin.learn.learn.mapper.UserMapper;
import com.kevin.learn.learn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * @Description:
 * @Author: Kevin
 * @Create 2019-07-19 16:37
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public int add(User user) {
        userMapper.insert(user);
        int id = user.getId();
        return id;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public int addCount() {
        //测试事物隔离级别传播属性 开启事物
        User user = new User();
        user.setAge(1);
        user.setCreateTime(new Date());
        user.setName("测试事物");
        user.setPhone("123123");
        userMapper.insert(user);
        int i = 9 / 0;
        return i;
    }
}
