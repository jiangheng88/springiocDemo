package cn.qst.springdemo.service;

import cn.qst.springdemo.entity.User;

public interface UserService {
    /*添加用户的方法*/
    public void addUser(User user);

    //输出用户的信息

    public void printUserInfo(User user);


}
