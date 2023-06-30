package testBook;
import entity.Book;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.BookService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class TestBook
{
    @Test
    public void testJdbcTemplate()
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService",BookService.class);

        //添加操作
        //添加第一本书
        //        Book book = new Book();
        //        book.setBookName("三国演义");
        //        book.setBookId("1");
        //        book.setBookStatus("在馆");
        //        bookService.addBook(book);

        //添加第二本书

        //        book.setBookName("水浒传");
        //        book.setBookId("2");
        //        book.setBookStatus("未在馆");

        //添加第三本书
        //        book.setBookName("Java课程设计");
        //        book.setBookId("5");
        //        book.setBookStatus("在馆");
        //        bookService.addBook(book);

        //修改操作
        //        book.setBookId("1");
        //        book.setBookStatus("未在馆");
        //        book.setBookName("Python课程");
        //        bookService.updateBook(book);

        //删除操作
        //        bookService.deleteBook("2");

        //查询返回某个值
        //        int count = bookService.findCount();
        //        System.out.println(count);

        //查询返回对象
        //        Book book = bookService.findOne("1");
        //        System.out.println(book);

        //查询返回集合
        //        List<Book> all = bookService.findAll();
        //        System.out.println(all);

        //批量添加
        //        List<Object[]> batchArgs = new ArrayList<>();
        //        Object[] o1 = {"简爱","6","在馆"};
        //        Object[] o2 = {"飘","7","未在馆"};
        //        Object[] o3 = {"时间简史","8","在馆"};
        //        batchArgs.add(o1);
        //        batchArgs.add(o2);
        //        batchArgs.add(o3);
        //        bookService.batchAdd(batchArgs);

        //批量修改
        //        List<Object[]> batchArgs = new ArrayList<>();
        //        Object[] o1 = {"认知学习","在馆","6"};
        //        Object[] o2 = {"原则","未在馆","7"};
        //        Object[] o3 = {"社会心理学","在馆","8"};
        //        batchArgs.add(o1);
        //        batchArgs.add(o2);
        //        batchArgs.add(o3);
        //        bookService.batchUpdate(batchArgs);

        //批量删除
        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {"2"};
        Object[] o2 = {"7"};
        Object[] o3 = {"8"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);
        bookService.batchDelete(batchArgs);


    }
}
