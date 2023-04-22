package com.scaler.lld.pakshi3;

import com.scaler.lld.pakshi3.interfaces.Flyable;
import com.scaler.lld.pakshi3.interfaces.Swimmable;

public class Swan extends Bird implements Swimmable, Flyable {

    public Swan(Double weight, String colour, Double size, String beakType) {
        super(weight, colour, size, beakType);
    }

    @Override
    public void fly() {
        System.out.println("SWAN is flying");
    }

    @Override
    public void swim() {
        System.out.println("SWAN is swimming");
    }

    @Override
    public void makeSound() {
        System.out.println("SWAN is making sound");
    }

}
