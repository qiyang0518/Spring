package testAop;
import aop.User;
import aopXml.Book;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class TestAop
{
    //效果:
    //before...
    //add...
    @Test
    public void testAop()
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        User user = context.getBean("user",User.class);
        user.add();
    }

    @Test
    public void testAopXml()
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        Book book = context.getBean("book",Book.class);
        book.buy();
    }
}
