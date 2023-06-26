package org.example.bean;
import bean.Empl;
import org.example.Orders;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserService;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class TestBean
{
    @Test
    public void testBean()
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        UserService userService = context.getBean("userService",UserService.class);
        System.out.println(userService);
        userService.add();
    }

    @Test
    public void testBean2()
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        Empl empl = context.getBean("empl",Empl.class);
        System.out.println(empl);
        empl.add();
    }

    @Test
    public void testBean4()
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        Empl empl = context.getBean("empl",Empl.class);
        System.out.println(empl);
        empl.add();
    }
}
