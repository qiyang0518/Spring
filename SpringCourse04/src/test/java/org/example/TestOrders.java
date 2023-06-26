package org.example;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class TestOrders
{
    @Test
    public void testOrders()
    {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        Orders orders = context.getBean("orders",Orders.class);
        System.out.println(orders);
        orders.OrdersTest();
    }

    @Test
    public void testDemo()
    {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        Demo demo = context.getBean("demo",Demo.class);
        System.out.println(demo);
        demo.DemoTest();
    }
}
