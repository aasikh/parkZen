package com.parkZen.parkZen.Entity;

public class Bike extends com.parkZen.parkZen.Entity.Vehicle {

    public Bike(){
        super();
    }

    public Bike(Long id, Enum vehicleNumber){
        super(id, "Bike", vehicleNumber);

    }
}
