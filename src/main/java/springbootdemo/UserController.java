package springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * controller类
 *
 * @author Administrator
 */
@RestController
@EnableAutoConfiguration
@SpringBootApplication
public class UserController {

  @RequestMapping("/login")
  public User login() {
    User user = new User();
    user.setId(123);
    user.setUsername("qwe");
    user.setPassword("456");
    return user;
  }

  @RequestMapping("/print")
  public String print1() {
    return "HELLO WORLD";
  }

  public static void main(String[] args) {
    SpringApplication.run(UserController.class);
  }
}
