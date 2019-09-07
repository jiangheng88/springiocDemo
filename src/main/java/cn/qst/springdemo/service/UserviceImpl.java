package cn.qst.springdemo.service;

import cn.qst.springdemo.dao.UserDao;
import cn.qst.springdemo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.SystemEnvironmentPropertySource;
import org.springframework.stereotype.Service;

import java.sql.SQLOutput;

/**
 * @author Administrator
 * @date 2019/9/4 19:48
 * @description
 */
@Service("userService")
public class UserviceImpl implements UserService {
    @Autowired
    @Qualifier("userdao2") //加载名字是userdao2的实现类
    private UserDao userDao;

    @Override
    public void addUser(User user) {
        userDao.addUser(user);

    }

    /*输出用户信息的方法*/
    @Override
    public void printUserInfo(User user) {
        System.out.println(user);
    }


}
