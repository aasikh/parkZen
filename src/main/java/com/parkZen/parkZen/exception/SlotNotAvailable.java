package com.parkZen.parkZen.exception;

public class SlotNotAvailable extends RuntimeException {
    public SlotNotAvailable(String message) {
        super(message);
    }
}
