package com.parkZen.parkZen.dto;

public class VehicleRequestDto {
private String vehicleNumber;
private enum VehicleType{
    CAR,
    BIKE,
    TRUCK
}
private VehicleType vehicleType;
public VehicleRequestDto(String vehicleNumber, VehicleType vehicleType){
    this.vehicleNumber = vehicleNumber;
    this.vehicleType = vehicleType;
}

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }
}
