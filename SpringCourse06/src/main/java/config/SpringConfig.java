package config;
import org.apache.camel.Configuration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
@Configuration  //作为配置类,替换xml配置文件
@ComponentScan(basePackages = "dao,service")
public class SpringConfig {}
