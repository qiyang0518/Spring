package dao;
import org.springframework.stereotype.Repository;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
@Repository
public class UserDaoImpl implements UserDao
{
    @Override
    public void add()
    {
        System.out.println("dao add...");
    }
}
