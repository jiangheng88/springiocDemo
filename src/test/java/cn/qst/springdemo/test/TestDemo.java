package cn.qst.springdemo.test;


import cn.qst.springdemo.entity.PojoConfig;
import cn.qst.springdemo.entity.User;
import cn.qst.springdemo.service.UserService;
import cn.qst.springdemo.utils.Intercepter;
import cn.qst.springdemo.utils.ProxyBeanFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.SystemEnvironmentPropertySource;

import java.security.PrivateKey;

/**
 * @author Administrator
 * @date 2019/9/4 16:52
 * @description
 */
public class TestDemo {
    @Test
    public void test() {
        ApplicationContext application = new ClassPathXmlApplicationContext("application.xml");
        // User user = (User) application.getBean("user");
        //System.out.println("得到的user是 : "+user);
        //User user1 = (User) application.getBean("user1");
        //System.out.println(user1);
        User user2 = (User) application.getBean("user2");
        //System.out.println(user2);

        //User user3 =(User) application.getBean("user3");
        //System.out.println(user3);

        //ApplicationContext  application1 = new AnnotationConfigApplicationContext(PojoConfig.class);
       //获得userService的实现类
        UserService userService = (UserService) application.getBean("userService");

        Intercepter intercepter = (Intercepter) application.getBean("interceptor");
        UserService proxy = ProxyBeanFactory.getBean(userService,intercepter);
        proxy.printUserInfo(user2);
        System.out.println("***************************");
        user2 = null;
        proxy.printUserInfo(user2);

    }
}
