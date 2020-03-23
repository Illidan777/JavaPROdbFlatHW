package com.gmail.gorbasenko245;

public class Flat {
    private String flatID;
    private String district;
    private String address;
    private double area;
    private int roomQuantity;
    private int price;

    public Flat(String flatID, String district,String address, double area, int roomQuantity, int price) {
        this.flatID = flatID;
        this.district = district;
        this.address = address;
        this.area = area;
        this.roomQuantity = roomQuantity;
        this.price = price;
    }


    public Flat() {
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getRoomQuantity() {
        return roomQuantity;
    }

    public void setRoomQuantity(int roomQuantity) {
        this.roomQuantity = roomQuantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getFlatID() {
        return flatID;
    }

    public void setFlatID(String flatID) {
        this.flatID = flatID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Flat{" +
                "flatID='" + flatID + '\'' +
                ", district='" + district + '\'' +
                ", address='" + address + '\'' +
                ", area=" + area +
                ", roomQuantity=" + roomQuantity +
                ", price=" + price +
                '}';
    }
}
