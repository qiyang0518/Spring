package testService;

import config.SpringConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserService;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class TestService
{
    @Test
    public void testService1()
    {
        //加载配置文件,根据配置文件
        //<context:component-scan base-package="dao,service"></context:component-scan>
        //开启扫描,扫描包中的所有类,如果有注解,根据注解创建对象
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        //创建对象
        UserService userService = context.getBean("userService",UserService.class);
        //输出对象地址
        System.out.println(userService);
        //调用对象add方法
        userService.add();
    }

    @Test
    public void testService2()
    {
        //加载配置文件,根据配置文件
        //<context:component-scan base-package="dao,service"></context:component-scan>
        //开启扫描,扫描包中的所有类,如果有注解,根据注解创建对象
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        //创建对象
        UserService userService = context.getBean("userService",UserService.class);
        //输出对象地址
        System.out.println(userService);
        //调用对象add方法
        userService.add();
    }
}

