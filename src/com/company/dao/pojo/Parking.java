package com.company.dao.pojo;

import java.util.Date;

public class Parking {
    private String name;
    private String address;
    private Integer lid;
    private Integer uid;
    private Date end_date;

    public Parking(String name, String address, Integer lid, Integer uid, Date end_date) {
        this.name = name;
        this.address = address;
        this.lid = lid;
        this.uid = uid;
        this.end_date = end_date;
    }

    public Parking(Integer lid, Integer uid, Date end_date) {
        this.lid = lid;
        this.uid = uid;
        this.end_date = end_date;
    }

    @Override
    public String toString() {
        return "Parking{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", lid=" + lid +
                ", uid=" + uid +
                ", end_date=" + end_date +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getLid() {
        return lid;
    }

    public void setLid(Integer lid) {
        this.lid = lid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }
}
