package com.company.dao.pojo;

import java.util.Date;

public class Parking {
    private Integer lid;
    private Date end_date;

    public Parking(Integer lid, Date end_date) {
        this.lid = lid;
        this.end_date = end_date;
    }

    @Override
    public String toString() {
        return "Parking{" +
                "lid=" + lid +
                ", end_date=" + end_date +
                '}';
    }

    public Integer getLid() {
        return lid;
    }

    public void setLid(Integer lid) {
        this.lid = lid;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }
}
