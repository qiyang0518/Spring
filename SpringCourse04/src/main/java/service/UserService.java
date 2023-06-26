package service;
import dao.UserDao;
import dao.UserDaoImpl;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class UserService
{
    private UserDao userDao;

    public void setUserDao(UserDao userDao)
    {
        this.userDao = userDao;
    }

    public void add()
    {
        System.out.println("add...");

        //普通方式创建对象
        UserDaoImpl userDao = new UserDaoImpl();
        userDao.update();

        //通过spring创建对象

    }
}
