package com.example.Restaurant.model;

public class Restaurant {
    private String name;
    private String address;
    private int number;
    private String speciality;
    private int totalStaff;

    public Restaurant(){

    }

    public Restaurant(String name, String address, int number, String speciality, int totalStaff) {
        this.name = name;
        this.address = address;
        this.number = number;
        this.speciality = speciality;
        this.totalStaff = totalStaff;
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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getTotalStaff() {
        return totalStaff;
    }

    public void setTotalStaff(int totalStaff) {
        this.totalStaff = totalStaff;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", number=" + number +
                ", speciality='" + speciality + '\'' +
                ", totalStaff=" + totalStaff +
                '}';
    }
}
