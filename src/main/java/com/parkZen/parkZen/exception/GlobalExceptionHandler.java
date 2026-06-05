package com.parkZen.parkZen.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler extends RuntimeException {

    //handle slot fulled
@ExceptionHandler(SlotNotAvailable.class)
    public ResponseEntity<Map<String, String>> handleSlotNotAvailable(SlotNotAvailable ex){
    Map<String, String> error = new HashMap<>();
    error.put("error", ex.getMessage());
    return ResponseEntity
            .status(HttpStatus.BAD_REQUEST)
            .body(error);
    }
    //handle user send wrong data type
    @ExceptionHandler(VehicleNumberAndTypeMismatched.class)
    public ResponseEntity<Map <String, String >> handleTypeMismatched(VehicleNumberAndTypeMismatched ex){
       Map <String , String > error = new HashMap<>();
       error.put("error" , ex.getMessage());
       return ResponseEntity
               .status(HttpStatus.BAD_REQUEST)
               .body(error);
    }
    @ExceptionHandler(TicketInvalid.class)
    public ResponseEntity<Map <String, String >> handleTypeMismatched(TicketInvalid ex){
        Map <String , String > error = new HashMap<>();
        error.put("error" , ex.getMessage());
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(error);
    }
    @ExceptionHandler(VehicleAlreadyExit.class)
    public ResponseEntity<Map <String, String >> handleTypeMismatched(VehicleAlreadyExit ex){
        Map <String , String > error = new HashMap<>();
        error.put("error" , ex.getMessage());
        return ResponseEntity
                .status(HttpStatus.CONFLICT)
                .body(error);
    }
}
// i added some code for testing only