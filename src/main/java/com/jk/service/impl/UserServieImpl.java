/**
 * Copyright (C),2019, 金科教育
 * FileName: UserServieImpl
 * Author:   马法冲
 * Date:     2019/4/11 23:21
 * Description: a
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.service.impl;

import com.jk.dao.UserDao;
import com.jk.model.User;
import com.jk.service.UserServie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈a〉
 *
 * @author MC
 * @create 2019/4/11
 * @since 1.0.0
 */
@Service
public class UserServieImpl implements UserServie {


    @Autowired
    private UserDao userDao;

    @Override
    public HashMap<String, Object> findUserList(Integer page, Integer rows) {
        HashMap<String, Object> param = new HashMap<>();
        int total = userDao.findUserCount();

        int start = (page-1)*rows;
        List<User> list = userDao.findUserList();
        param.put("total", total);
        param.put("rows", list);
        return param;
    }

    @Override
    public void delUser(Integer id) {
        userDao.delUser(id);
    }

    @Override
    public void saveUser(User user) {
        userDao.save(user);
    }

    @Override
    public User findUserById(User users) {
        /*return userDao.findUserById(id);*/
       User us = userDao.getOne(users.getId());
        return us;
    }
}