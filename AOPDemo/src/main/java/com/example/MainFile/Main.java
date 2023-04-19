package com.example.MainFile;

import com.example.config.proConfig;
import com.example.model.Song;
import com.example.service.VehicleService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(proConfig.class);
        VehicleService vehicleService = context.getBean(VehicleService.class);
        System.out.println(vehicleService.getClass());
        Song song = new Song();
        song.setSongname("Volume 1");
        song.setSinger("Honey Singh");
        boolean vehicleStarted = true;
        String vehicleMusic = vehicleService.playMusic(vehicleStarted,song);
        String moveVehicle = vehicleService.moveVehicle(vehicleStarted);
        String applybrake = vehicleService.applyBrake(vehicleStarted);
        System.out.println(vehicleMusic);
        System.out.println(moveVehicle);
        System.out.println(applybrake);
    }
}
