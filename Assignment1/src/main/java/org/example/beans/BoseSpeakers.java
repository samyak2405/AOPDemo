package org.example.beans;

import org.example.interfaces.Speakers;
import org.springframework.stereotype.Component;

@Component
public class BoseSpeakers implements Speakers {
    public String makeSound()
    {
        return "Playing music with BoseSpeakers.";
    }
}
