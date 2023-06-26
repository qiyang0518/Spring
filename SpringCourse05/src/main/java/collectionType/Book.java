package collectionType;
import java.util.List;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Book
{
    private List<String> list;

    public void setList(List<String> list)
    {
        this.list = list;
    }

    public void test()
    {
        System.out.println(list);
    }
}
