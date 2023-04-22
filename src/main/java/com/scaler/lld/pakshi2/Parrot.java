package com.scaler.lld.pakshi2;

import com.scaler.lld.pakshi2.abstractclass.FlyableBird;

public class Parrot extends FlyableBird{

    public Parrot(Double weight, String colour, Double size, String beakType) {
        super(weight, colour, size, beakType);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void fly() {
        System.out.println("PARROT is flying");
    }

    @Override
    public void makeSound() {
        System.out.println("PARROT is making sound");
    }
    
}
