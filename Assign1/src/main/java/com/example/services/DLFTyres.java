package com.example.services;

import com.example.interfaces.Tyres;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class DLFTyres implements Tyres {
    public String rotate()
    {
        return "Vehicle is running of DLF Tyres";
    }
}
