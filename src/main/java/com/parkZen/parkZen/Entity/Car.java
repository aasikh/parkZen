package com.parkZen.parkZen.Entity;

public class Car extends com.parkZen.parkZen.Entity.Vehicle {

    public Car(){
        super();
    }

    public Car(Long id, Enum vehicleNumber){
        super(id, "Car", vehicleNumber);

    }
}
