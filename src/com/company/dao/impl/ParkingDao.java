package com.company.dao.impl;

import com.company.dao.idao.IParkingDao;
import com.company.dao.pojo.Parking;
import com.company.dao.util.DBUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ParkingDao implements IParkingDao {
    @Override
    public List<Parking> parkingFindAll() throws SQLException {
        Connection conn = DBUtil.getConnection();
        String sql = "SELECT b.`name`,b.address,lid,uid,end_date FROM db_parking a, db_community b WHERE a.cid=b.id;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        List<Parking> parkingList = new ArrayList<>();
        while (rs.next()) {
            Parking parking = new Parking(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getDate(5));
            parkingList.add(parking);
        }
        DBUtil.close(rs,ps,conn);
        return parkingList;
    }

    @Override
    public List<Parking> parkingFindById(int id) throws SQLException {
        Connection conn = DBUtil.getConnection();
        String sql = "SELECT b.`name`,b.address,a.lid,a.uid,a.end_date FROM db_parking a, db_community b WHERE a.cid=b.id AND a.uid = ?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1,id);
        ResultSet rs = ps.executeQuery();
        List<Parking> parkingList = new ArrayList<>();
        while (rs.next()) {
            Parking parking = new Parking(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getDate(5));
            parkingList.add(parking);
        }
        DBUtil.close(rs,ps,conn);
        return parkingList;
    }

    @Override
    public List<Parking> parkingFindByCid(int cid) throws SQLException {
        Connection conn = DBUtil.getConnection();
        String sql = "SELECT b.`name`,b.address,a.lid,a.uid,a.end_date FROM db_parking a, db_community b WHERE a.cid=b.id AND a.cid = ?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1,cid);
        ResultSet rs = ps.executeQuery();
        List<Parking> parkingList = new ArrayList<>();
        while (rs.next()) {
            Parking parking = new Parking(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getDate(5));
            parkingList.add(parking);
        }
        DBUtil.close(rs,ps,conn);
        return parkingList;
    }

    @Override
    public int parkingUpdate(Parking parking) throws SQLException {
        Connection con = DBUtil.getConnection();
        String sql = "update db_parking set uid=?,end_date=? where lid=?;";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1,parking.getUid());
        ps.setDate(2, new Date(parking.getEnd_date().getTime()));
        ps.setInt(3,parking.getLid());
        int flag = ps.executeUpdate();
        DBUtil.close(null,ps,con);
        return flag;
    }
}
