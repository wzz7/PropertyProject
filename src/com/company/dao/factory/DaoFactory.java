package com.company.dao.factory;

import com.company.dao.impl.UserDao;
import com.company.dao.pojo.User;

public class DaoFactory {

    public static Object getInstance(String name){
        switch (name){
            case "USER":
                return new UserDao();
            default:
                return null;
        }
    }
}
