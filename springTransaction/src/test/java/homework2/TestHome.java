package homework2;

import com.huadi.aop.aspect.StudentService;
import com.huadi.aop.aspect.User;
import com.huadi.homework2.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wuzhiguo
 * @date 2020/9/1
 */
public class TestHome {
    @Test
    public void testAdvice(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("homeworkAspect.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.addUser("aaa","123");
      /*  userService.selectUser();*/
    }
}
