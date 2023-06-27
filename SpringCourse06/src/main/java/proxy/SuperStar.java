package proxy;
/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class SuperStar implements Star
{
    private String name;

    public SuperStar(String name)
    {
        this.name = name;
    }
    public String sing(String name)
    {
        System.out.println(this.name + "singing" + name);
        return "Thanks";
    }
    public String dance(String name)
    {
        System.out.println(this.name + "dancing" + name);
        return "Thanks";
    }

}
