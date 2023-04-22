package com.scaler.lld.pakshi2;

import com.scaler.lld.pakshi2.abstractclass.NonFlyableBird;

public class Penguin  extends NonFlyableBird{

    public Penguin(Double weight, String colour, Double size, String beakType) {
        super(weight, colour, size, beakType);
    }

    
    @Override
    public void makeSound() {
        
    }

 
    
}
