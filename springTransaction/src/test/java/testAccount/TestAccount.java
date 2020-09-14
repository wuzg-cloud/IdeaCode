package testAccount;

import com.huadi.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author wuzhiguo
 * @date 2020/8/31
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:applicationContext3.xml")
public class TestAccount {

    @Autowired
    private AccountService accountService;

    @Test
    public void test(){
        /*ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        accountService = (AccountService) context.getBean("accountService");*/
        accountService.transfer("bbb","aaa",3000);
    }
}
