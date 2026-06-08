package com.parkZen.parkZen.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "truck_parking")
public class TruckParking extends ParkingLot {

    public TruckParking() {
        super();
    }
}