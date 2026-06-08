package com.parkZen.parkZen.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "car_parking")
public class CarParking extends ParkingLot {

    public CarParking() {
        super();
    }
}