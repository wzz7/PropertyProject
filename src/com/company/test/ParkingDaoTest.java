package com.company.test;

import com.company.dao.impl.ParkingDao;
import com.company.dao.pojo.Parking;
import org.junit.Before;
import org.junit.Test;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

public class ParkingDaoTest {
    ParkingDao parkingDao;
    @Before
    public void setUp() throws Exception {
        parkingDao = new ParkingDao();
    }

    @Test
    public void findAllParking() throws SQLException {
        List<Parking> allParking = parkingDao.findAllParking();
        System.out.println(allParking);
    }

    @Test
    public void findById() throws SQLException {
        final List<Parking> byId = parkingDao.findById(2);
        System.out.println(byId);

    }

    @Test
    public void findByCid() throws SQLException {
        final List<Parking> byCid = parkingDao.findByCid(1);
        System.out.println(byCid);
    }

    @Test
    public void updateParking() throws SQLException {
        final Parking parking = new Parking(4,4,new Date());
        final int i = parkingDao.updateParking(parking);
        System.out.println(i);
    }
}