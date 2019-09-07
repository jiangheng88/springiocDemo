package cn.qst.springdemo.dao;

import cn.qst.springdemo.entity.User;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 * @date 2019/9/4 19:44
 * @description
 */
@Component("userdao1")
@Primary
public class UserDaoImpl implements UserDao{
    @Override
    public void addUser(User user) {
        List<User> list =new  ArrayList<>();
        list.add(user);
    }
}
