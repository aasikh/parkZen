package com.parkZen.parkZen.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "bike_parking")
public class BikeParking extends ParkingLot {

    public BikeParking() {
        super();
    }
}