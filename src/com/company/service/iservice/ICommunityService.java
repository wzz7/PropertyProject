package com.company.service.iservice;

import com.company.dao.pojo.Community;

import java.util.List;

public interface ICommunityService {
    public List<Community> findAll();
    public List<Community> finById(Integer id);
}
