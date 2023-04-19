package com.example.services;

import com.example.interfaces.Tyres;
import org.springframework.stereotype.Component;

@Component
public class MRFTyres implements Tyres {
    public String rotate()
    {
        return "Vehicle is running on MRF Tyres";
    }
}
