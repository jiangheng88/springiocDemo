package cn.qst.springdemo.utils;

import org.springframework.stereotype.Component;

/**
 * @author Administrator
 * @date 2019/9/5 9:40
 * @description
 */
@Component("interceptor")
public class InterceptorImpl implements Intercepter{
    @Override
    public void before(Object obj) {
        System.out.println("准备打印用户信息");
    }

    @Override
    public void after(Object obj) {
        System.out.println("已经完成用户信息的打印");
    }

    @Override
    public void afterReturning(Object obj) {
        System.out.println("成功打印，没有发生异常");
    }

    @Override
    public void afterThrowing(Object obj) {
        System.out.println("打印功能已执行成功，但是出现了异常");
    }
}
