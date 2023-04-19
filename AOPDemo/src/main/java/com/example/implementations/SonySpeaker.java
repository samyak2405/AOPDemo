package com.example.implementations;

import com.example.interfaces.Speakers;
import com.example.model.Song;
import org.springframework.stereotype.Component;

@Component
public class SonySpeaker implements Speakers {
    @Override
    public String makeSound(Song song) {
        return "Sony Speakers are playing "+song.getSongname()+" sung by "+song.getSinger();
    }
}
