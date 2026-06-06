package com.parkZen.parkZen;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table
public class Vehicle {

    private long id;
    private String vehicleType;
    private String vehicleNumber;

    public enum vehicleType{
        Car,
        Truck,
        Bike
    }

    public Vehicle(){
    }

    public Vehicle(long id, String vehicleType, String vehicleNumber){
        this.id = id;
        this.vehicleType = vehicleType;
        this.vehicleNumber = vehicleNumber;
    }

    public int getId() {
        return Math.toIntExact(id);
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        vehicleType = vehicleType;
    }

    public void getVehicleNumber(String vehicleNumber) {
        vehicleNumber = vehicleNumber;
    }

    public String setVehicleNumber() {
        return vehicleNumber;
    }


}
