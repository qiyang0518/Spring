package dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
@Repository
public class UserDaoImpl implements UserDao
{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    //多钱
    @Override
    public void addMoney()
    {
        String sql = "update account set money = money + ? where userName = ?";
        jdbcTemplate.update(sql,100,"marry");
    }

    //少钱
    @Override
    public void reduceMoney()
    {
        String sql = "update account set money = money - ? where userName = ?";
        jdbcTemplate.update(sql,100,"lucy");
    }
}
