package com.company.service.impl;

import com.company.comm.Const;
import com.company.dao.factory.DaoFactory;
import com.company.dao.idao.IUserDao;
import com.company.dao.pojo.User;
import com.company.service.iservice.IUserService;

import java.sql.SQLException;

public class UserService implements IUserService {
    private IUserDao userDao;

    public UserService() {
        userDao = (IUserDao) DaoFactory.getInstance(Const.USER);
    }

    @Override
    public User login(String username, String password) {
        User user = null;
        try {
            user = userDao.login(username,password);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return user;
    }

    @Override
    public int register(User user) {
        int flag = 0;
        try {
            flag = userDao.register(user);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return flag;
    }

    @Override
    public User findByName(String username) {
        User user = null;
        try {
            user = userDao.findByName(username);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return user;
    }
}
