package com.scaler.lld.pakshi4;

import com.scaler.lld.pakshi4.interfaces.Flyable;

public class Parrot  extends Bird implements Flyable{
     
    public Parrot(Double weight, String colour, Double size, String beakType) {
        super(weight, colour, size, beakType);        
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
