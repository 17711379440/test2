package com.accp.service;

import com.accp.pojo.User;

/**
 * @Description:
 * @Author: liyong
 * @CreateDate: 2018/1/13 15:53
 * @Version: 1.0
 */

public interface UserService {
    boolean addUser(User user);
    User findById(int id);

}
