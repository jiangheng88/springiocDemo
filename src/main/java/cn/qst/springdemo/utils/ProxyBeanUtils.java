package cn.qst.springdemo.utils;

import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.security.PrivateKey;

/**
 * @author Administrator
 * @date 2019/9/5 10:06
 * @description
 */
public class ProxyBeanUtils implements InvocationHandler {
    //被代理的对象
    private Object obj;
    //拦截器
    @Autowired
    private Intercepter intercepter;

    /*获得Bean的方法*/
    public static Object getBean(Object obj, Intercepter intercepter) {
        ProxyBeanUtils _this = new ProxyBeanUtils();
        _this.obj = obj;
        _this.intercepter = intercepter;
        //返回的是动态代理的对象
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),
                obj.getClass().getInterfaces(), _this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object object =  null;
        //是否有异常
        boolean flag = false;
        intercepter.before(obj);
        try {
            object = method.invoke(obj,args);
        }catch (Exception e){
            flag = true;
        }finally {
            intercepter.after(obj);
        }

        if(flag){
            intercepter.afterThrowing(obj);
        }else{
            intercepter.afterThrowing(obj);
        }

        return object;
    }
}
