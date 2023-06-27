package dao;
/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class UserDaoImpl implements  UserDao
{
    @Override
    public int add(int a,int b)
    {
        return a + b;
    }

    @Override
    public String update(String id)
    {
        return id;
    }
}
