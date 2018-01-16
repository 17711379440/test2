package com.accp.web.controller;

import com.accp.pojo.User;
import com.accp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @Description:
 * @Author: liyong
 * @CreateDate: 2018/1/13 15:57
 * @Version: 1.0
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/findById")
    @ResponseBody
    public User findById(int id) {
        User user = userService.findById(id);
        return user;
    }
    //    private UserService userService;
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add() {
        return "add";
    }

    @ResponseBody
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(HttpServletRequest request) {
        System.out.println(1);
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User user = new User(username, password);
        boolean flag = userService.addUser(user);
        if (flag) {
            return "成功";
        }
        return "失败";
    }

}
