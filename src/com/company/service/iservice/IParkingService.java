package com.company.service.iservice;

import com.company.dao.pojo.Parking;

import java.util.List;

public interface IParkingService {

    List<Parking> findAll();

    List<Parking> findByCid(int id);

    List<Parking> findByName(String username);
}
