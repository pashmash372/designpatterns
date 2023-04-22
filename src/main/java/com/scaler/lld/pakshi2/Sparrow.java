package com.scaler.lld.pakshi2;

import com.scaler.lld.pakshi2.abstractclass.FlyableBird;

public class Sparrow extends FlyableBird{
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
