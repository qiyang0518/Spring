package config;
import org.apache.camel.Configuration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
//配置类
@Configuration
//开启组件扫描
@ComponentScan(basePackages = {"aop"})
//生成代理对象(proxyTargetClass默认为false)
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ConfigAop{}
