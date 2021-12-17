package com.company.dao.impl;

import com.company.dao.idao.ICommunityDao;
import com.company.dao.pojo.Community;
import com.company.dao.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CommunityDao implements ICommunityDao {
    @Override
    public List<Community> findAll() throws Exception {
        Connection con = DBUtil.getConnection();
        String sql="SELECT  communityNum,name,address,communityArea,buildingNum,roomNum,greeningRate,developerName,propertyName FROM db_community";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        List<Community> coms = new ArrayList<Community>();
        while(rs.next()){
            Community community = new Community(rs.getString(1),rs.getString(2),rs.getString(3),rs.getDouble(4),rs.getInt(5),rs.getInt(6),rs.getDouble(7),rs.getString(8),rs.getString(9));
            coms.add(community);
        }
        DBUtil.close(rs,ps,con);
        return coms;

    }

    @Override
    public List<Community> findById(int id) throws Exception {
        Connection con = DBUtil.getConnection();
        String sql="select communityNum,`name`,address,communityArea,buildingNum,roomNum,greeningRate,developerName,propertyName from db_community a,sys_user b where b.id=? and b.cid = a.id;";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1,id);
        ResultSet rs = ps.executeQuery();
       List<Community>com =new ArrayList<Community>();
       while (rs.next()){
           Community com1 = new Community(rs.getString(1),rs.getString(2),rs.getString(3),rs.getDouble(4),rs.getInt(5),rs.getInt(6),rs.getDouble(7),rs.getString(8),rs.getString(9));
            com.add(com1);
        }

        return com;
    }


}
