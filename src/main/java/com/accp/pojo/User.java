package com.accp.pojo;

import java.io.Serializable;

/**
 * @Description:
 * @Author: liyong
 * @CreateDate: 2018/1/13 15:45
 * @Version: 1.0
 */
public class User implements Serializable {
    private Integer id;
    private  String username;
    private  String password;

    public  User(){}
    public User(String username, String password) {
        this.username=username;
        this.password=password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
