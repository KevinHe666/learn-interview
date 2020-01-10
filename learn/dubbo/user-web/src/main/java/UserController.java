import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.UserService;

/**
 * @Description:
 * @Author: Kevin
 * @Create 2020-01-06 08:55
 */
@RestController
public class UserController {
    @Reference(version = "1.0.0", url = "dubbo://127.0.0.1:12345")
    private UserService userService;

    @RequestMapping("/sayHello")
    public String sayHello() {
        return userService.sayHello();
    }

}
