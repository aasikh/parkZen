package com.parkZen.parkZen.Entity;

public class Truck extends com.parkZen.parkZen.Entity.Vehicle {

    public Truck(){
        super();
    }

    public Truck(Long id, Enum vehicleNumber){
        super(id, "Truck", vehicleNumber);

    }
}
