package com.scaler.lld.pakshi3;

import com.scaler.lld.pakshi3.interfaces.Flyable;

public class Sparrow extends Bird implements Flyable{
    public Sparrow(Double weight, String colour, Double size, String beakType) {
        super(weight, colour, size, beakType);        
    }

    @Override
    public void fly() {
        System.out.println("SPARROW is flying");
    }

    @Override
    public void makeSound() {
        System.out.println("SPARROW is making sound");
    }
    
}
