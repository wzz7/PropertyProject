package com.company.dao.idao;

import com.company.dao.pojo.User;

import java.sql.SQLException;

public interface IUserDao {
    User login(String username, String password) throws SQLException;
    int register(User user) throws SQLException;
    User findByName(String username) throws SQLException;
    int update(User user) throws SQLException;
}
