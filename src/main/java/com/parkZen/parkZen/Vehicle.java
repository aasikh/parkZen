package com.parkZen.parkZen;

public class Vehicle {

    private int id;
    private String vehicleType;
    private String vehicleNumber;

    public enum vehicleType{
        Car,
        Truck,
        Bike
    }

    public Vehicle(){
    }

    public Vehicle(int id, String vehicleType, String vehicleNumber){
        this.id = id;
        this.vehicleType = vehicleType;
        this.vehicleNumber = vehicleNumber;
    }

    public int getId() {
        return id;
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


    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", vehicleType=" + vehicleType +
                ", vehicleNumber='" + vehicleNumber + '\'' +
                '}';
    }
}
