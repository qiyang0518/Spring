package service;
import dao.BookDao;
import entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
@Service
public class BookService
{
    //注入dao
    @Autowired
    private BookDao bookDao;

    //添加操作
    public void addBook(Book book)
    {
        bookDao.add(book);
    }

    //修改操作
    public void updateBook(Book book)
    {
        bookDao.updateBook(book);
    }

    //删除操作
    public void deleteBook(String id)
    {
        bookDao.delete(id);
    }

    //查询表记录数
    public int findCount()
    {
        return bookDao.selectCount();
    }

    //查询返回对象
    public Book findOne(String id)
    {
        return bookDao.findBookInfo(id);
    }

    //查询返回集合
    public List<Book> findAll()
    {
        return bookDao.finAllBook();
    }

    //批量添加操作
    public void batchAdd(List<Object[]> batchargs)
    {
        bookDao.batchAddBook(batchargs);
    }

    //批量修改操作
    public void batchUpdate(List<Object[]> batchargs)
    {
        bookDao.batchUpdateBook(batchargs);
    }

    //批量删除操作
    public void batchDelete(List<Object[]> batchargs)
    {
        bookDao.batchDeleteBook(batchargs);
    }
}
