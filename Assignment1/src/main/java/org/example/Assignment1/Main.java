package org.example.Assignment1;

import org.example.beans.Vehicle;
import org.example.config.proConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.example.beans.Person;
public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(proConfig.class);
        String[] persons = context.getBeanNamesForType(Person.class);
        Person person = context.getBean(Person.class);
        String[] names = context.getBeanNamesForType(Vehicle.class);
        Vehicle vehicle = context.getBean(Vehicle.class);
        vehicle.getVehicleServices().playMusic();
        vehicle.getVehicleServices().moveVehicle();
    }
}