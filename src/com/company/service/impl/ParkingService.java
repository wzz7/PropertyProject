package com.company.service.impl;

import com.company.comm.Const;
import com.company.dao.factory.DaoFactory;
import com.company.dao.idao.IParkingDao;
import com.company.dao.impl.ParkingDao;
import com.company.dao.pojo.Parking;
import com.company.service.iservice.IParkingService;

import java.sql.SQLException;
import java.util.List;

public class ParkingService implements IParkingService {
    private IParkingDao parkingDao;
    public ParkingService() { parkingDao = (IParkingDao) DaoFactory.getInstance(Const.PARKING);}

    @Override
    public List<Parking> findAll() {
        List<Parking> parkingList = null;
        try {
            parkingList = parkingDao.parkingFindAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return parkingList;
    }

    @Override
    public List<Parking> findByCid(int cid) {
        List<Parking> parkingList = null;
        try {
            parkingList = parkingDao.parkingFindByCid(cid);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return parkingList;
    }

    @Override
    public List<Parking> findByName(String username) {
        List<Parking> parkingList = null;
        try {
            parkingList = parkingDao.parkingFindByName(username);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return parkingList;
    }
}
