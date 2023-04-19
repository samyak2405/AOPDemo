package com.example.implementations;

import com.example.interfaces.Tyres;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class DLFTyres implements Tyres {
    @Override
    public String rotate() {
        return "Vehicle is running on DLF Tyres";
    }

    @Override
    public String stop() {
        return "Vehicle stopped with the help of DLF Tyres";
    }
}
