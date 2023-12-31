package entity;
/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Book
{
    private String bookId;
    private String bookName;
    private String bookStatus;

    public String getBookId()
    {
        return bookId;
    }

    public void setBookId(String bookId)
    {
        this.bookId = bookId;
    }

    public String getBookName()
    {
        return bookName;
    }

    public void setBookName(String bookName)
    {
        this.bookName = bookName;
    }

    public String getBookStatus()
    {
        return bookStatus;
    }

    public void setBookStatus(String bookStatus)
    {
        this.bookStatus = bookStatus;
    }

    @Override
    public String toString()
    {
        return "Book:" + "bookId=" + bookId + " bookName=" + bookName + " bookStatus=" + bookStatus + "\n";
    }
}
