package com.example.travelservice.models.exceptions;

public class TripNotFoundException extends RuntimeException {
    public TripNotFoundException(String id){
        super(String.format("Trip with id %d does not exist.", id));
    }
}
