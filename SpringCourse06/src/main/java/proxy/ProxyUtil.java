package proxy;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class ProxyUtil
{
    public static Star creatProxy(SuperStar superStar)
    {
        /**
         ClassLoader loader:指定类加载器
         Class<?>[] interfaces:指定代理有实现方法(接口数组)
         InvocationHandler h:指定生成的代理对象做什么(用匿名内部类实现)
         */
        //创建代理对象
        Star starProxy = (Star) Proxy.newProxyInstance(ProxyUtil.class.getClassLoader(),new Class[]{Star.class},new InvocationHandler()
        {
            //回调方法
            @Override
            public Object invoke(Object proxy,Method method,Object[] args) throws Throwable
            {
                //代理对象具体做什么,在这里实现
                //判断传入方法是否为sing方法,true则传入superStar及其他参数
                if(method.getName().equals("sing"))
                {
                    System.out.println("准备话筒...");
                }
                else if(method.getName().equals("dance"))
                {
                    System.out.println("准备场地...");
                }
                return method.invoke(superStar,args);
            }
        });
        return starProxy;
    }
}
