package com.example.implementations;

import com.example.interfaces.Speakers;
import com.example.model.Song;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class boseSpeaker implements Speakers {
    @Override
    public String makeSound(Song song) {
        return "Bose Speakers are playing "+song.getSongname()+" sung by "+song.getSinger();
    }
}
