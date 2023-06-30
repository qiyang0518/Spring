package dao;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public interface UserDao
{
    //多钱、少钱方法
    public void addMoney();
    public void reduceMoney();
}
