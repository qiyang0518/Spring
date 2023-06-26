package bean;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class MyBeanPost implements BeanPostProcessor
{
    @Override
    public Object postProcessBeforeInitialization(Object bean,String beanName) throws BeansException
    {
        System.out.println("执行初始化之前的方法");
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean,beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean,String beanName) throws BeansException
    {
        System.out.println("执行初始化之后的方法");
        return BeanPostProcessor.super.postProcessAfterInitialization(bean,beanName);
    }
}
