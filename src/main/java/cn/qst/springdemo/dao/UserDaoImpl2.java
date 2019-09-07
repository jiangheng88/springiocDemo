package cn.qst.springdemo.dao;

import cn.qst.springdemo.entity.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 * @date 2019/9/4 19:50
 * @description
 */
@Component("userdao2")
public class UserDaoImpl2 implements  UserDao{
    @Override
    public void addUser(User user) {
        System.out.println("天加成功");

    }
}
