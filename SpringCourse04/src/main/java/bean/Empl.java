package bean;
/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
//员工类
public class Empl
{
    private String eName;
    private String gender;
    private Dept dept;

    public void seteName(String eName)
    {
        this.eName = eName;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public void setDept(Dept dept)
    {
        this.dept = dept;
    }

    @Override
    public String toString()
    {
        return "Empl" + "eName=" + eName + '\t' + "gender=" + gender + '\t' + "dept=" + dept + '\t';
    }

    public void add()
    {
        System.out.println(eName + " " + gender + " " + dept);
    }


}
