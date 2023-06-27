package aop;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
@Component
@Aspect
//增强类
public class UserProxy
{
    //相同切入点的提取
    @Pointcut(value = "execution(* aop.User.add(..))")
    public void pointCatch(){}

    //前置通知
    @Order(0)
    @Before(value = "pointCatch()")
    //增强aop中的User类中的add方法
    public void before()
    {
        System.out.println("before...");
    }

    //后置通知
    @AfterReturning(value = "execution(* aop.User.add(..))")
    public void afterReturning()
    {
        System.out.println("afterReturning...");
    }

    @AfterThrowing(value = "execution(* aop.User.add(..))")
    public void afterThrowing()
    {
        System.out.println("afterThrowingr...");
    }

    @After(value = "execution(* aop.User.add(..))")
    public void after()
    {
        System.out.println("after...");
    }

    @Around(value = "execution(* aop.User.add(..))")
    public void around(ProceedingJoinPoint point) throws Throwable
    {
        System.out.println("around before...");
        point.proceed();
        System.out.println("around after...");
    }
}
