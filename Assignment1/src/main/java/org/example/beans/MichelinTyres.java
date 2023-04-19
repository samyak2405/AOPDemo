package org.example.beans;
import org.example.interfaces.Tyres;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MichelinTyres implements Tyres {
    public String rotate()
    {
        return "Rotating with Michelin tyres";
    }
}
