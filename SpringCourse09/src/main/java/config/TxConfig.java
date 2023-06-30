package config;
import com.alibaba.druid.pool.DruidDataSource;
import org.apache.camel.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
//配置类
@Configuration
//组件扫描
@ComponentScan(basePackages = "dao,service")
//开启事务
@EnableTransactionManagement
public class TxConfig
{
    //创建数据库连接池
    @Bean
    public DruidDataSource getDruidDataSource()
    {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/jdbc_mysql");
        dataSource.setUsername("root");
        dataSource.setPassword("0518");
        return dataSource;
    }

    //创建JDBCTemplate对象
    @Bean
    public JdbcTemplate getJdbcTemplate(DataSource dataSource)
    {
        //在IOC容器中根据类型找到dataSource
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        //注入dataSource
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate;
    }

    //创建事务管理器
    @Bean
    public DataSourceTransactionManager getDataSourceTransactionManager(DataSource dataSource)
    {
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
        transactionManager.setDataSource(dataSource);
        return transactionManager;
    }
}
