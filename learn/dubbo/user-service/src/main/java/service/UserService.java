package service;

import impl.UserServiceImpl;
import org.apache.dubbo.config.annotation.Service;

/**
 * @Description:
 * @Author: Kevin
 * @Create 2020-01-06 08:59
 */
public interface UserService {
    String sayHello();
}