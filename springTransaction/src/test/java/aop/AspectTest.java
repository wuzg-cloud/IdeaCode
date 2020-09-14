package aop;

import com.huadi.aop.aspect.StudentService;
import com.huadi.aop.aspect.User;
import com.huadi.aop.aspect2.LoginService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wuzhiguo
 * @date 2020/9/1
 */
public class AspectTest {
    @Test
    public void testAspect(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aspect.xml");
        LoginService loginService = (LoginService) context.getBean("loginService");
        loginService.addUser();
       /* loginService.deleteUser();
        loginService.updateUser();
        loginService.selectUser();*/
    }
}
