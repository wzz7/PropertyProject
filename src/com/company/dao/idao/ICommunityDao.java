package com.company.dao.idao;

import com.company.dao.pojo.Community;

import java.util.List;

public interface ICommunityDao {
    List<Community> findAll();
    List<Community> findById();
}
