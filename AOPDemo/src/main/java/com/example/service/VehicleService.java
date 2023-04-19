package com.example.service;

import com.example.interfaces.Speakers;
import com.example.interfaces.Tyres;
import com.example.model.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Level;
import java.util.logging.Logger;

@Component
public class VehicleService {
    @Autowired
    private Speakers speakers;
    private Tyres tyres;

    private Logger logger = Logger.getLogger(VehicleService.class.getName());


    public String playMusic(boolean VehicleStarted, Song song)
    {
//        Instant start = Instant.now();
//        logger.info("Method Execution Starts");
//        logger.info("Method execution ends");
       String status = "";
       if(VehicleStarted)
       {
           status = speakers.makeSound(song);
       }
       else {
           logger.log(Level.SEVERE,"Vehicle not Started yet");
       }
//        Instant end = Instant.now();
//        long timeElapsed = Duration.between(start,end).toMillis();
//        logger.info("Time it took for method to execute: "+timeElapsed+" ms");
        return tyres.rotate();
//        return status;
    }


    public String moveVehicle(boolean VehicleStarted)
    {
//        Instant start = Instant.now();
//        logger.info("Method execution Starts");
       String status = "";
       if(VehicleStarted)
       {
           status = tyres.rotate();
       }
       else {
           logger.log(Level.SEVERE,"Vehicle not Started yet");
       }
//        Instant end = Instant.now();
//        logger.info("Method execution ends");
//        long timeElapsed = Duration.between(start,end).toMillis();
//        logger.info("Time it took for method to execute: "+timeElapsed+" ms");
//        return status;
        return tyres.rotate();
    }

    public String applyBrake(boolean VehicleStarted)
    {
//        Instant start = Instant.now();
//        logger.info("Method Execution starts");
       String status = "";
       if(VehicleStarted)
       {
           status = tyres.stop();
       }
       else {
           logger.log(Level.SEVERE,"Vehicle not Started Yet");
       }
//        Instant end = Instant.now();
//        logger.info("Method Execution ends");
//        long timeElapsed = Duration.between(start,end).toMillis();
//        logger.info("Time taken by method for execution: "+timeElapsed+" ms");
//        return status;
        return tyres.stop();
    }
    public Speakers getSpeakers() {
        return speakers;
    }

    public void setSpeakers(Speakers speakers) {
        this.speakers = speakers;
    }

    public Tyres getTyres() {
        return tyres;
    }

    @Autowired
    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }
}
