package com.example.services;

import com.example.interfaces.Speakers;
import org.springframework.stereotype.Component;

@Component
public class SonySpeaker implements Speakers {
    public String makeSound()
    {
        return "Sound is Being produced by Sony Speakers";
    }
}
