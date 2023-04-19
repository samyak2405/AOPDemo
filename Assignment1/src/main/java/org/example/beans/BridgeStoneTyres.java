package org.example.beans;

import org.example.interfaces.Tyres;
import org.springframework.stereotype.Component;

@Component
public class BridgeStoneTyres implements Tyres {
    public String rotate()
    {
        return "Rotating with BridgeStoneTyres";
    }
}
