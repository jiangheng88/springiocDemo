package cn.qst.springdemo.utils;

import org.springframework.beans.factory.BeanFactory;

/**
 * @author Administrator
 * @date 2019/9/5 9:33
 * @description  获得Bean的实体类
 */
public class ProxyBeanFactory {

    public static <T> T getBean(T obj,Intercepter intercepter){
        return (T) ProxyBeanUtils.getBean(obj,intercepter);

    }
}
