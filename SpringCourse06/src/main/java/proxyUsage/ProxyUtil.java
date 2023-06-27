package proxyUsage;

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
    public static UserService createProxy(UserService userService)
    {
        //生成用户代理
        //Proxy.newProxyInstance生成的时Object类型,需要强转为UserService类型
        UserService userServiceProxy = (UserService) Proxy.newProxyInstance(proxy.ProxyUtil.class.getClassLoader()
        ,new Class[]{UserService.class},new InvocationHandler()
        {
            @Override
            public Object invoke(Object proxy,Method method,Object[] args) throws Throwable
            {
                //指定代理需要做的事情
                if(method.getName().equals("login")
                        || method.getName().equals("deleteUsers")
                        || method.getName().equals("selectUsers"))
                {
                    //获取开始时间
                    long startTime = System.currentTimeMillis();
                    Object rs = method.invoke(userService,args);
                    //获取结束时间
                    long endTime = System.currentTimeMillis();
                    //输出时间差
                    System.out.println(method.getName() + "执行耗时:" + (endTime - startTime) / 1000.0 + "s");
                    return rs;
                }
                else
                {
                    Object rs = method.invoke(userService,args);
                    return rs;
                }
            }
        });
        return userServiceProxy;
    }
}
