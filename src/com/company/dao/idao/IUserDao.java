package com.company.dao.idao;

import com.company.dao.pojo.User;

import java.sql.SQLException;

public interface IUserDao {
    User login(String username, String password) throws SQLException;
    User register(String username, String realname, String password, String email, String phone) throws SQLException;
    int save(User user) throws SQLException;
}
