package org.example;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class OrdersTest
{
    @Test
    public void run()
    {
        System.out.println("Hello World");
    }

    @Test
    public void testOrders()
    {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("bean2.xml");
        Orders orders= context.getBean("orders",Orders.class);
        System.out.println(orders);
        orders.ordersTest();
    }
}
