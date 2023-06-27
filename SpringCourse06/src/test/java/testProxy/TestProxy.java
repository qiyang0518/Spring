package testProxy;
import proxy.ProxyUtil;
import proxy.Star;
import proxy.SuperStar;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class TestProxy
{
    public static void main(String[] args)
    {
        //创建明星对象
        SuperStar superStar = new SuperStar("刘德华");
        //创建代理对象
        Star starProxy = ProxyUtil.creatProxy(superStar);
        String singName = starProxy.sing("好日子");
        System.out.println(singName);
        String danceName = starProxy.dance("霹雳舞");
        System.out.println(danceName);
    }
}
