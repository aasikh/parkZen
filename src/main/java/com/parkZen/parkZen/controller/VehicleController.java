package com.parkZen.parkZen.controller;

import com.parkZen.parkZen.exception.SlotNotAvailable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehicleController {
    @GetMapping("test")
    public String test(){
        throw new SlotNotAvailable("No slot Available");
    }
}
