package com.jk.service;

import com.jk.model.User;

import java.util.HashMap;

public interface UserServie {

    HashMap<String,Object> findUserList(Integer page, Integer rows);
    void delUser(Integer id);

    void saveUser(User user);

    User findUserById(User users);
}
