package testUser;
import config.TxConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserService;


/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class TestUser
{
    @Test
    public void testAccount()
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userService",UserService.class);
        userService.accountMoney();
    }

    //测试XML声明式事务管理
    @Test
    public void testAccount2()
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        UserService userService = context.getBean("userService",UserService.class);
        userService.accountMoney();
    }

    //全注解测试
    @Test
    public void testAccount3()
    {
        //配置类的class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TxConfig.class);
        UserService userService = context.getBean("userService",UserService.class);
        userService.accountMoney();
    }
}
