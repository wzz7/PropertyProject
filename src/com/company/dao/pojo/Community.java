package com.company.dao.pojo;

public class Community {
    private String communityNum;
    private String name;
    private String address;
    private double communityArea;
    private int buildingNum;
    private int roomNum;
    private double greeningRate;
    private String developName;
    private String propertyName;

    public Community(String communityNum, String name, String address, double communityArea, int buildingNum, int roomNum, double greeningRate, String developName, String propertyName) {
        this.communityNum = communityNum;
        this.name = name;
        this.address = address;
        this.communityArea = communityArea;
        this.buildingNum = buildingNum;
        this.roomNum = roomNum;
        this.greeningRate = greeningRate;
        this.developName = developName;
        this.propertyName = propertyName;
    }

    @Override
    public String toString() {
        return "Community{" +
                "communityNum='" + communityNum + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", communityArea=" + communityArea +
                ", buildingNum=" + buildingNum +
                ", roomNum=" + roomNum +
                ", greeningRate=" + greeningRate +
                ", developName='" + developName + '\'' +
                ", propertyName='" + propertyName + '\'' +
                '}';
    }

    public String getCommunityNum() {
        return communityNum;
    }

    public void setCommunityNum(String communityNum) {
        this.communityNum = communityNum;
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

    public double getCommunityArea() {
        return communityArea;
    }

    public void setCommunityArea(double communityArea) {
        this.communityArea = communityArea;
    }

    public int getBuildingNum() {
        return buildingNum;
    }

    public void setBuildingNum(int buildingNum) {
        this.buildingNum = buildingNum;
    }

    public int getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }

    public double getGreeningRate() {
        return greeningRate;
    }

    public void setGreeningRate(double greeningRate) {
        this.greeningRate = greeningRate;
    }

    public String getDevelopName() {
        return developName;
    }

    public void setDevelopName(String developName) {
        this.developName = developName;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }
}
