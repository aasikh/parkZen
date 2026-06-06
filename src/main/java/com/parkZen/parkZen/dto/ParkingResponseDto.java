package com.parkZen.parkZen.dto;

public class ParkingResponseDto {

    private Long ticketId;
    private String vehicleNumber;
    private Long slotId;
    private String entryTime;

    private enum Status{
        ACTIVE,
        COMPLETED
    }
    private Status status;

    public ParkingResponseDto(Long ticketId, String vehicleNumber, Long slotId, String entryTime, Status status){
        this.ticketId = ticketId;
        this.vehicleNumber = vehicleNumber;
        this.slotId = slotId;
        this.entryTime = entryTime;
        this.status = status;
    }
    public Long getTicketId() {
        return ticketId;
    }

    public void setTicketId(Long ticketId) {
        this.ticketId = ticketId;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(String entryTime) {
        this.entryTime = entryTime;
    }

    public Long getSlotId() {
        return slotId;
    }

    public void setSlotId(Long slotId) {
        this.slotId = slotId;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

}

