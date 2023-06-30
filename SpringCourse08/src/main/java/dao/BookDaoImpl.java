package dao;
import entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
@Repository
public class BookDaoImpl implements BookDao
{
    //注入JdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    //批量删除
    @Override
    public void batchDeleteBook(List<Object[]> batchargs)
    {
        String sql = "delete from bookInfo where bookId = ?";
        int[] ints = jdbcTemplate.batchUpdate(sql,batchargs);
        System.out.println(Arrays.toString(ints));
    }

    //批量修改
    @Override
    public void batchUpdateBook(List<Object[]> batchArgs)
    {
        String sql = "update bookInfo set bookName = ?,bookStatus = ? where bookId = ?";
        int[] ints = jdbcTemplate.batchUpdate(sql,batchArgs);
        System.out.println(Arrays.toString(ints));
    }

    //批量添加
    @Override
    public void batchAddBook(List<Object[]> batchargs)
    {
        String sql = "insert into bookInfo values(?,?,?)";
        int[] ints = jdbcTemplate.batchUpdate(sql,batchargs);
        System.out.println(Arrays.toString(ints));
    }

    //查询返回集合
    @Override
    public List<Book> finAllBook()
    {
        String sql = "select * from bookInfo";
        //调用方法
        List<Book> bookList = jdbcTemplate.query(sql,new BeanPropertyRowMapper<Book>(Book.class));
        return bookList;
    }

    //查询返回对象
    @Override
    public Book findBookInfo(String id)
    {
        String sql = "select * from bookInfo where bookId = ?";
        //调用方法
        Book book = jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<Book>(Book.class),id);
        return book;
    }

    //查询表记录数
    @Override
    public int selectCount()
    {
        String sql = "select count(*) from bookInfo";
        Integer count = jdbcTemplate.queryForObject(sql,Integer.class);
        return count;
    }

    //添加操作
    @Override
    public void add(Book book)
    {
        //创建sql语句
        //sql中???,表示占位符
        String sql = "insert into bookInfo value(?,?,?)";
        Object[] args = {book.getBookName(),book.getBookId(),book.getBookStatus()};
        //调用方法实现
        int update = jdbcTemplate.update(sql,args);
        System.out.println(update);
    }

    //修改操作
    @Override
    public void updateBook(Book book)
    {
        String sql = "update bookInfo set bookName = ?,bookId = ?,bookStatus = ?";
        Object[] args = {book.getBookName(),book.getBookId(),book.getBookStatus()};
        //调用方法实现
        int update = jdbcTemplate.update(sql,args);
        System.out.println(update);
    }

    //删除操作
    @Override
    public void delete(String id)
    {
        String sql = "delete from bookInfo where bookId = ?";
        //调用方法实现
        int update = jdbcTemplate.update(sql,id);
        System.out.println(update);
    }
}
