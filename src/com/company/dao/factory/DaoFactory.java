package com.company.dao.factory;

import com.company.dao.impl.ParkingDao;
import com.company.dao.impl.UserDao;
import com.company.dao.pojo.User;

public class DaoFactory {

    public static Object getInstance(String name){
        switch (name){
            case "USER":
                return new UserDao();
            case "PARKING":
                return new ParkingDao();
            default:
                return null;
        }
    }
}
