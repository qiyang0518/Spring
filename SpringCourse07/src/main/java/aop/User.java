package aop;
import org.springframework.stereotype.Component;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
@Component
//原始类
public class User
{
    public void add()
    {
        System.out.println("add...");
    }
}
