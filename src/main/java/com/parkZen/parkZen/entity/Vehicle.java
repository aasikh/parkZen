package com.parkZen.parkZen.entity;

import jakarta.persistence.*;

@Entity
@Table (name = "Vehicle")

public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String vehicleNumber;
    private Enum vehicleType;

    public Vehicle(int id, String Vehicle_Number, Enum vehicleType){
        this.id = id;
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Enum getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(Enum vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }
}
