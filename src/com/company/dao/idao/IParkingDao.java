package com.company.dao.idao;

import com.company.dao.pojo.Parking;

import java.util.Date;
import java.util.List;

public interface IParkingDao {
    List<Parking> findAllParking();
    List<Parking> findById();
    int updateParking();
}
