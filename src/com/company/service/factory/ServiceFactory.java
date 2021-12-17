package com.company.service.factory;

import com.company.service.impl.UserService;

public class ServiceFactory {
    public static Object getInstance(String name){
        switch (name){
            case "USER":
                return new UserService();
            default:
                return null;
        }
    }
}
