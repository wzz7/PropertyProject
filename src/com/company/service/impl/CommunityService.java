package com.company.service.impl;

import com.company.dao.idao.ICommunityDao;
import com.company.dao.pojo.Community;
import com.company.service.iservice.ICommunityService;

import java.util.List;

public class CommunityService implements ICommunityService {
    private ICommunityDao iCommunityDao;

    public CommunityService() {
    }

    @Override
    public List<Community> findAll() {
            List<Community>communityList=null;
        try {
            communityList=iCommunityDao.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return communityList;
    }

    @Override
    public List<Community> finById(Integer id) {
        List<Community>communityList=null;
        try {
            communityList=iCommunityDao.findById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return communityList;
    }
}
