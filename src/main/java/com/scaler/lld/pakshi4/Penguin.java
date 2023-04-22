package com.scaler.lld.pakshi4;

import com.scaler.lld.pakshi4.interfaces.Swimmable;

public class Penguin  extends Bird implements Swimmable{

    public Penguin(Double weight, String colour, Double size, String beakType) {
        super(weight, colour, size, beakType);
    }

    
    @Override
    public void makeSound() {
        System.out.println("PENGUIN is making sound");
    }


    @Override
    public void swim() {        
        System.out.println("PENGUIN is swimming");
    }

 
    
}
