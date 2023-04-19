package com.example.services;

import com.example.interfaces.Speakers;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BoseSpeaker implements Speakers {
    public String makeSound()
    {
        return "Sound is being Produced by Bose Speakers";
    }
}
