package dao;
import entity.Book;

import java.util.List;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public interface BookDao
{
    //添加方法
    void add(Book book);

    //修改方法
    void updateBook(Book book);

    //删除方法
    void delete(String id);

    //查询记录数
    int selectCount();

    //查询返回对象
    Book findBookInfo(String id);

    //查询返回集合
    List<Book> finAllBook();

    //批量添加
    void batchAddBook(List<Object[]> batchargs);

    //批量修改
    void batchUpdateBook(List<Object[]> batchargs);

    void batchDeleteBook(List<Object[]> batchargs);
}
