package org.example.ProjectConfig;

import org.example.beans.Persons;
import org.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.beans.BeanProperty;

@Configuration
@ComponentScan(basePackages = "org.example.beans")
public class ProConfig {
//    @Bean
//    public Vehicle vehicle()
//    {
//        Vehicle vehicle = new Vehicle();
//        vehicle.setName("Toyota");
//        return vehicle;
//    }

//Wiring Beans Using Method Call
//    @Bean
//    public Persons person()
//    {
//        Persons person = new Persons();
//        person.setName("Samyak");
//        person.setVehicle(vehicle());
//        return person;
//    }

    //OR

    //Wiring Beans usng Method Parameters
//    @Bean
//    public Persons person(Vehicle vehicle)
//    {
//        Persons person = new Persons();
//        person.setName("Samyak");
//        person.setVehicle(vehicle);
//        return person;
//    }
}
