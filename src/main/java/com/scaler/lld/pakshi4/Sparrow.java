package com.scaler.lld.pakshi4;

import com.scaler.lld.pakshi4.interfaces.Flyable;
import com.scaler.lld.pakshi4.strategies.FlyingBehaviour;

public class Sparrow extends Bird implements Flyable {

    // Depending on another concrete class
    // instead we should depend on interfaces
    private FlyingBehaviour flyingBehaviour;

    public Sparrow(Double weight, String colour, Double size, String beakType, FlyingBehaviour flyingBehaviour) {
        super(weight, colour, size, beakType);
        this.flyingBehaviour = flyingBehaviour;
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
