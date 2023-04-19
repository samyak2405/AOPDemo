package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {
    private String name = "Toyota";


    private final VehicleService vehicleService;

    @Autowired
    public Vehicle(VehicleService vehicleService)
    {
        this.vehicleService = vehicleService;
    }
    public VehicleService getVehicleService() {
        return vehicleService;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
