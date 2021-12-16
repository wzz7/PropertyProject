package com.company.dao.idao;

import com.company.dao.pojo.User;

public interface IUserDao {
    User login(String username, String password);
    User register(String username, String realname, String password, String email, String phone);
}
