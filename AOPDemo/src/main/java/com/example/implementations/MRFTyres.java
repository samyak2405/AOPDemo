package com.example.implementations;

import com.example.interfaces.Tyres;
import org.springframework.stereotype.Component;

@Component
public class MRFTyres implements Tyres {

    @Override
    public String rotate() {
        return "Vehicle is running on MRF Tyres";
    }

    @Override
    public String stop() {
        return "Vehicle stopped with the help of MRF Tyres";
    }
}
