package bean;
/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Orders
{
    private String oName;

    public Orders()
    {
        System.out.println("使用无参构造器...");
    }

    public void setoName(String oName)
    {
        this.oName = oName;
        System.out.println("调用set方法...");
    }

    //创建执行初始化方法
    public void initMethod()
    {
        System.out.println("执行初始化方法");
    }

    //执行销毁方法
    public void destroyMethod()
    {
        System.out.println("执行销毁方法");
    }
}
