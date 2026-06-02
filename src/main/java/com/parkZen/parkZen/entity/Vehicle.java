package com.parkZen.parkZen.entity;

import jakarta.persistence.*;

@Entity
@Table (name = "Vehicle")

public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column()
    private String Vehicle_Number;
    private Enum Vehicle_Type;

    public Vehicle(int id, String Vehicle_Number, Enum Vehicle_Type){
        this.id = id;
        this.Vehicle_Number = Vehicle_Number;
        this.Vehicle_Type = Vehicle_Type;

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVehicle_Number() {
        return Vehicle_Number;
    }

    public void setVehicle_Number(String vehicle_Number) {
        Vehicle_Number = vehicle_Number;
    }

    public String getVehicle_Type() {
        return Vehicle_Type;
    }

    public void setVehicle_Type(String vehicle_Type) {
        Vehicle_Type = vehicle_Type;
    }
}
