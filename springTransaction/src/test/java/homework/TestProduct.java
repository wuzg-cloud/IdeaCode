package homework;

import com.huadi.homework.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.Date;

/**
 * @author wuzhiguo
 * @date 2020/8/31
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:applicationHomework1.xml")
public class TestProduct {

    @Autowired
    private ProductService productService;

    @Test
    public void testAdd(){
        productService.testAddDelete("aaa", Date.valueOf("1777-1-1"),1);
    }

}
