package aop;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
@Component
@Aspect
@Order(0)
public class PersonProxy
{
    @Before(value = "execution(* aop.User.add(..))")
    public void before()
    {
        System.out.println("Person Before...");
    }
}
