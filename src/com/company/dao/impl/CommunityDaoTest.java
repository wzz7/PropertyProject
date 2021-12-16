package com.company.dao.impl;

import com.company.dao.idao.ICommunityDao;
import com.company.dao.pojo.Community;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CommunityDaoTest {
        ICommunityDao iCommunityDao;
    @Before
    public void setUp() throws Exception {
        iCommunityDao=new CommunityDao();
    }

    @Test
    public void findAll() throws Exception {
        List<Community> all = iCommunityDao.findAll();
        System.out.println(all);
    }

    @Test
    public void findById() throws Exception {
        List<Community> byId = iCommunityDao.findById(2);
        System.out.println(byId);
    }
}