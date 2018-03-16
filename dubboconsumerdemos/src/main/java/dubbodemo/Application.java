package dubbodemo;

import dubbodemo.pservice.MyCityService;
import dubbodemo.serviceimpl.MyCityServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Spring Boot 应用启动类
 */
// Spring Boot 应用的标识
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        // 程序启动入口
        // 启动嵌入式的 Tomcat 并初始化 Spring 环境及其各 Spring 组件
        ConfigurableApplicationContext run=SpringApplication.run(Application.class,args);
        MyCityService cityService = run.getBean(MyCityServiceImpl.class);
        cityService.printCity();
    }
}
