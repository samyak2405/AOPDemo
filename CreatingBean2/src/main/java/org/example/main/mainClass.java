package org.example.main;

import org.example.bean.Vehicle;
import org.example.config.config;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class mainClass {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(config.class);
//        Vehicle veh1 = context.getBean(Vehicle.class);
//        System.out.println(veh1.getName());
//        veh1.printHello();
//        context.close();

        Vehicle volkswagen = new Vehicle();
        volkswagen.setName("Volkswagen");
        Supplier<Vehicle> volkswagenSupplier = () -> volkswagen;

        Supplier<Vehicle> audiSupplier = () -> {
            Vehicle audi = new Vehicle();
            audi.setName("Audi");
            return audi;
        };

        Random random = new Random();
        int randomNumber = random.nextInt(10);
        System.out.println("RandomNumber: " + randomNumber);

        if (randomNumber % 2 == 0) {
            context.registerBean("volkswagen", Vehicle.class, volkswagenSupplier);
        } else {
            context.registerBean("audi", Vehicle.class, audiSupplier);
        }
        Vehicle volksVehicle = null;
        Vehicle audiVehicle = null;
        try{
            volksVehicle = context.getBean("volkswagen",Vehicle.class);
        }catch (NoSuchBeanDefinitionException NoSuchBeanDefinitionException)
        {
            System.out.println("Error While creating Volkswagen Vehicle");
        }
        try
        {
            audiVehicle = context.getBean("audi",Vehicle.class);
        }catch (NoSuchBeanDefinitionException NoSuchBeanDefinitionException)
        {
            System.out.println("Error While creating audi Vehicle");
        }
        if(null!=volksVehicle)
            System.out.println("Programming Vehicle name from Spring Context is: "+volksVehicle.getName());
        else
            System.out.println("Programming Vehicle name from Spring Context is: "+audiVehicle.getName());
        context.close();
    }
}