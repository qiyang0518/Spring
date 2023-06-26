package testAutoWire;
import autoWire.Empl;
import collectionType.Course;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class TestAutoWire
{
    @Test
    public void testFactoryBean()
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean5.xml");
        Empl empl = context.getBean("empl",Empl.class);
        System.out.println(empl);
    }
}
