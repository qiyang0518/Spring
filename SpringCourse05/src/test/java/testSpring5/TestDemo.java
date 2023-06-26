package testSpring5;
import collectionType.Book;
import collectionType.Course;
import collectionType.Stu;
import factoryBean.MyBean;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class TestDemo
{
    @Test
    public void testCollection()
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Stu stu = context.getBean("stu",Stu.class);
        stu.test();
    }

    @Test
    public void testList()
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        Book book = context.getBean("book",Book.class);
        book.test();
    }

    @Test
    public void testFactoryBean()
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
         Course course = context.getBean("myBean",Course.class);
        System.out.println(course);
    }
}
