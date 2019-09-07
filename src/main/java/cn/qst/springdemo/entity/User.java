package cn.qst.springdemo.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

import javax.management.monitor.StringMonitor;
import java.sql.Ref;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author Administrator
 * @date 2019/9/4 16:47
 * @description
 */
/*使用註解的方式裝配Bean*/

    @Component(value = "user5")

public class User {
        @Value("1")
    private int id;
        @Value("嗯嗯")
    private String username;
        @Value("123489")
    private String userpass;

    private Function function = null;
    private List<Function> list;
    private Set<Function> set;
    private Map<String,Function> map;

    public User() {
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getUserpass() {
        return userpass;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setUserpass(String userpass) {
        this.userpass = userpass;
    }

    public Function getFunction() {
        return function;
    }

    public void setFunction(Function function) {
        this.function = function;
    }

    public List<Function> getList() {
        return list;
    }

    public void setList(List<Function> list) {
        this.list = list;
    }

    public Set<Function> getSet() {
        return set;
    }

    public void setSet(Set<Function> set) {
        this.set = set;
    }

    public Map<String, Function> getMap() {
        return map;
    }

    public void setMap(Map<String, Function> map) {
        this.map = map;
    }


    public User(int id, String username, String userpass) {
        this.id = id;
        this.username = username;
        this.userpass = userpass;
    }



    public User(int id, String username) {
        this.id = id;
        this.username = username;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", userpass='" + userpass + '\'' +
                ", function=" + function +
                ", list=" + list +
                ", set=" + set +
                ", map=" + map +
                '}';
    }

    public User( @Autowired Function function) {
        this.function = function;
    }
}
