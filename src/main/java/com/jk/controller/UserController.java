/**
 * Copyright (C),2019, 金科教育
 * FileName: UserController
 * Author:   马法冲
 * Date:     2019/4/11 23:19
 * Description: a
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.controller;

import com.jk.model.User;
import com.jk.service.UserServie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * 〈一句话功能简述〉<br> 
 * 〈a〉
 *
 * @author MC
 * @create 2019/4/11
 * @since 1.0.0
 */
@RestController
public class UserController {

    @Autowired
    private UserServie userService;

    @RequestMapping("findUserList")
    public HashMap<String,Object> findUserList(Integer page,Integer rows){
        HashMap<String,Object> par=userService.findUserList(page,rows);
        return par;
    }
    @RequestMapping("delUser")
    public Boolean delUser(Integer id){
        userService.delUser(id);
        return true;
    }
    @RequestMapping("saveUser")
    public Boolean saveUser(User user){
        userService.saveUser(user);
        return true;
    }
    @RequestMapping("findUserById")
    public User findUserById(User users){
        User user = userService.findUserById(users);
        return user;
    }
}