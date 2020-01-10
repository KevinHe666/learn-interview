package impl;

import org.apache.dubbo.config.annotation.Service;
import service.UserService;

/**
 * @Description:
 * @Author: Kevin
 * @Create 2020-01-06 09:43
 */
@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {

    @Override
    public String sayHello() {
        System.out.println("sayhello");
        return "Hello";
    }
}