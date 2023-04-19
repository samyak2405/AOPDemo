package org.example.Main;

import org.example.ProConfig.ProConfig;
import org.example.beans.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProConfig.class);
        Person person = context.getBean(Person.class);
        System.out.println("Person name from Spring Context is "+person.getName());
        System.out.println("Vehicle that Person own is "+person.getVehicle());
    }
}