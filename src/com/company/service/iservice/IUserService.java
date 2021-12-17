package com.company.service.iservice;

import com.company.dao.pojo.User;

import java.sql.SQLException;

public interface IUserService {
    User login(String username, String password);
    int register(User user);
    User findByName(String username);
    int update(User user) throws SQLException;
}
