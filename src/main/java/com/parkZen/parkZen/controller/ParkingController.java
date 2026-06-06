package com.parkZen.parkZen.controller;

import com.parkZen.parkZen.dto.ParkingRequestDto;
import com.parkZen.parkZen.dto.ParkingResponseDto;
import com.parkZen.parkZen.exception.SlotNotAvailable;
import com.parkZen.parkZen.service.ParkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/parking")
public class ParkingController {
   private final ParkingService parkingService;
   public ParkingController(ParkingService parkingService){
       this.parkingService= parkingService;
   }
    @PostMapping("/park")
    public ParkingResponseDto park(@RequestBody ParkingRequestDto parkingRequestDto){
    ParkingResponseDto response =  parkingService.parkVehicle();
    return response;
    }
}
