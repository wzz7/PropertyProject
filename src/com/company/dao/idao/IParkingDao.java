package com.company.dao.idao;

import com.company.dao.pojo.Parking;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

public interface IParkingDao {
    List<Parking> parkingFindAll() throws SQLException;
    List<Parking> parkingFindByName(String username) throws SQLException;
    List<Parking> parkingFindByCid(int cid) throws SQLException;
    int parkingUpdate(Parking parking) throws SQLException;
}
