package aop;

import com.huadi.aop.aspect.StudentService;
import com.huadi.aop.aspect.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wuzhiguo
 * @date 2020/9/1
 */
public class AopTest {
    @Test
    public void testAdvice(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext4.xml");
        StudentService studentService = (StudentService) context.getBean("studentService");
        User user = new User();
        studentService.addUser(user);
    }
}
