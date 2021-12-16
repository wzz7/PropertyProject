package com.company.dao.idao;

import com.company.dao.pojo.Parking;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

public interface IParkingDao {
    List<Parking> findAllParking() throws SQLException;
    List<Parking> findById(int id) throws SQLException;
    List<Parking> findByCid(int cid) throws SQLException;
    int updateParking(Parking parking) throws SQLException;
}
