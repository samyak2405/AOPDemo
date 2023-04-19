package org.example.ProConfig;

import org.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "org.example.beans")
public class ProConfig {
//    @Primary
    @Bean
    Vehicle vehicle1()
    {
        var veh = new Vehicle();
        veh.setName("Audi");
        return veh;
    }

    @Bean
    Vehicle vehicle2()
    {
        Vehicle veh = new Vehicle();
        veh.setName("Toyota");
        return veh;
    }

    @Bean
    Vehicle vehicle3()
    {
        Vehicle veh = new Vehicle();
        veh.setName("Hyundai");
        return veh;
    }
}
