package com.yg.dao;

import com.yg.pojo.User;

import java.util.List;

public interface Userdao {
    public int insertUser(User user);

    public List<User> select(int username, int password);
}
