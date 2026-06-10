package com.parkZen.parkZen.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "parking_lot")
public class ParkingLot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String parkingNumber;

    @Enumerated(EnumType.STRING)
    private Enum parkingType;

    public enum parkingType {
        CAR,
        BIKE,
        TRUCK
    }

    public ParkingLot() {
    }

    public ParkingLot(Long id, String parkingNumber, Enum parkingType) {
        this.id = id;
        this.parkingNumber = parkingNumber;
        this.parkingType = parkingType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getParkingNumber() {
        return parkingNumber;
    }

    public void setParkingNumber(String parkingNumber) {
        this.parkingNumber = parkingNumber;
    }

    public Enum getParkingType() {
        return parkingType;
    }

    public void setParkingType(Enum parkingType) {
        this.parkingType = parkingType;
    }
}