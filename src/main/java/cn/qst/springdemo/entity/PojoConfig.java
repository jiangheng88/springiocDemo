package cn.qst.springdemo.entity;

import org.springframework.context.annotation.ComponentScan;

/**
 * @author Administrator
 * @date 2019/9/4 19:14
 * @description
 */
//@ComponentScan  /*开启扫描此包中的类*/
/*这个注解是开启扫描注解用的，没有他这个中的注解都不能使用*，不用注解的话也可以使用XML文件配置开启注解的配置*/
//@ComponentScan(basePackageClasses = {User.class,Function.class})
//@ComponentScan(basePackages ={"cn.qst.springdemo.entity","cn.qst.springdemo.dao","cn.qst.springdemo.service"} )
/*@ComponentScan有两个配置项，basePackageClasses  可以配置多个类  basePackages 可以配置多个包*/
public class PojoConfig {
}
