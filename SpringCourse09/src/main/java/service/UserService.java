package service;
import dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
@Service
@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.SERIALIZABLE)
public class UserService
{
    @Autowired
    private UserDao userDao;




    //转账方法
    public void accountMoney()
    {
        /**
         * 编程式事务管理
        try
        {
            //开启事务操作

            //进行业务操作

            //没有异常,提交事务

            //luvy少100
            userDao.reduceMoney();

            //marry多100
            userDao.addMoney();
        } catch(Exception e)
        {
            //出现异常,事务回滚
            e.printStackTrace();
        }
         */
        userDao.reduceMoney();
        int a = 10 / 0;
        userDao.addMoney();

    }
}
