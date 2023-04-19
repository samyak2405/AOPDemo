package com.example.Assignment;

import com.example.beans.Vehicle;
import com.example.config.ProConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.example.beans.Person;
public class Main {
    public static void main(String[] args) {
      var context = new AnnotationConfigApplicationContext(ProConfig.class);
      String[] persons = context.getBeanNamesForType(Person.class);
      String[] names = context.getBeanNamesForType(Vehicle.class);
      Person person = context.getBean(Person.class);
      Vehicle vehicle = context.getBean(Vehicle.class);
      vehicle.getVehicleService().playMusic();
      vehicle.getVehicleService().moveVehicle();
    }
}