package autoWire;
/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Empl
{
    private Dept dept;

    public void setDept(Dept dept)
    {
        this.dept = dept;
    }

    @Override
    public String toString()
    {
        return "Empl{" + "dept=" + dept + '}';
    }

    public void test()
    {
        System.out.println(dept);
    }
}
