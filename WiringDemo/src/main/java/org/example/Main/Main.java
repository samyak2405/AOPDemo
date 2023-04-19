package org.example.Main;

import org.example.ProjectConfig.ProConfig;
import org.example.beans.Persons;
import org.example.beans.Vehicle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProConfig.class);
        Persons person = context.getBean(Persons.class);
        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println("Person name from Spring Context is "+person.getName());
        System.out.println("Vehicle name from Spring Context is "+vehicle.getName());
        System.out.println(person.getName()+"'s "+person.getVehicle());
    }
}