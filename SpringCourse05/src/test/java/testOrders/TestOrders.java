package testOrders;
import bean.Orders;
import collectionType.Course;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class TestOrders
{
    //测试成功
    @org.junit.jupiter.api.Test
    void MyTest()
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        Orders orders = context.getBean("orders",Orders.class);
        System.out.println("获取bean对象");
        System.out.println(orders);
        //手动让bean实例销毁
        context.close();
    }

    //测试不成功
    public TestOrders()
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        Orders orders = context.getBean("orders",Orders.class);
        System.out.println("获取bean对象");
        System.out.println(orders);
        //手动让bean实例销毁
        context.close();
    }

    //测试不成功
    @Test
    public void testOrders()
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        Orders orders = context.getBean("orders",Orders.class);
        System.out.println("获取bean对象");
        System.out.println(orders);
        //手动让bean实例销毁
        context.close();
    }

    @Test
    public void run()
    {
        System.out.println("你好世界!");
    }
}

