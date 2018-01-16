package com.accp.service.impl;

import com.accp.dao.UserDao;
import com.accp.pojo.User;
import com.accp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Description:
 * @Author: liyong
 * @CreateDate: 2018/1/15 10:40
 * @Version: 1.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    @Transactional
    public boolean addUser(User user) {

        return userDao.add(user) ==1;
    }

    @Override
    public User findById(int id) {
        return userDao.findById(id);
    }
}
