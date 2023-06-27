package service;
import dao.UserDao;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @author 齐阳
 * @version 1.0
 */
//等价于 <bean id="userService> class=""/>
//在注解里value属性值可以省略,默认为类名称小写
//@Component(value = "userService")
@SuppressWarnings({"all"})
@Service
public class UserService
{
    //定义dao类型属性
    //    @Autowired
    //    @Qualifier(value = "userDaoImpl")
    @Resource(name = "userDaoImpl")
    private UserDao userDao;

    @Value(value = "abc")
    private String name;

    public void add()
    {
        System.out.println("Service Add..." + name);
        userDao.add();
    }
}
