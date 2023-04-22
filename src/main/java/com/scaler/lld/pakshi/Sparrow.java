package com.scaler.lld.pakshi;

public class Sparrow extends Bird{

    public Sparrow(Double weight, String colour, Double size, String beakType) {
        super(weight, colour, size, beakType);
        //TODO Auto-generated constructor stub
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
