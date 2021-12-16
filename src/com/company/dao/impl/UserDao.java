package com.company.dao.impl;

import com.company.dao.idao.IUserDao;
import com.company.dao.pojo.User;
import com.company.dao.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao implements IUserDao {
    @Override
    public User login(String username, String password) throws SQLException {
        User user = null;
        Connection conn = DBUtil.getConnection();
        String sql ="select username,realname,`password`,phone,email from sys_user where username=? and `password`=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        if (rs.next()){
            user = new User(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
        }
        DBUtil.close(rs,ps,conn);
        return user;
    }

    @Override
    public int save(User user) throws SQLException {
        Connection conn = DBUtil.getConnection();
        String sql ="insert into sys_user VALUES(?,?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1,user.getUsername());
        ps.setString(2,user.getRealname());
        ps.setString(3,user.getPassword());
        ps.setString(4,user.getPhone());
        ps.setString(5,user.getEmail());
        int i = ps.executeUpdate();
        DBUtil.close(null,ps,conn);
        return i;
    }

    @Override
    public User register(String username, String realname, String password, String email, String phone) throws SQLException {
        User user = null;
        Connection conn = DBUtil.getConnection();
        String sql ="select username,realname,`password`,phone,email from sys_user where username=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        if (rs.next()){
            user = new User(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
        }
        return user;
    }

}
