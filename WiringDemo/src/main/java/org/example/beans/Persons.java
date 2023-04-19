package org.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Persons {
    private String name = "Samyak";

//    @Autowired(required = false)
    private final Vehicle vehicle;

    @Autowired
    public Persons(Vehicle vehicle)
    {
        System.out.println("Person bean created by Spring");
        this.vehicle = vehicle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

//    @Autowired(required = false)
//    public void setVehicle(Vehicle vehicle) {
//        this.vehicle = vehicle;
//    }
}
