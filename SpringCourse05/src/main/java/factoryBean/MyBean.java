package factoryBean;
import collectionType.Course;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
//设置MyBean对象,返回类型为Course类,工厂Bean
public class MyBean implements FactoryBean<Course>
{
    public void test()
    {}

    //定义返回类型
    @Override
    public Course getObject() throws Exception
    {
        Course course = new Course();
        course.setcName("java");
        return course;
    }

    @Override
    public Class<?> getObjectType()
    {
        return null;
    }

    @Override
    public boolean isSingleton()
    {
        return FactoryBean.super.isSingleton();
    }
}
