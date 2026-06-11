package com.parkZen.parkZen.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "parking_Spot")
public class ParkingSpot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String parkingNumber;

    @Enumerated(EnumType.STRING)
    private ParkingType parkingType;

    public enum ParkingType {
        CAR,
        BIKE,
        TRUCK
    }

    public ParkingSpot() {
    }

    public ParkingSpot(Long id, String parkingNumber, Enum parkingType) {
        this.id = id;
        this.parkingNumber = parkingNumber;
        this.parkingType = (ParkingType) parkingType;
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
        this.parkingType = (ParkingType) parkingType;
    }
}