package com.scaler.lld.pakshi3;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public abstract class Bird {
    // Step 1 - Add attributes
    private Double weight;
    private String colour;
    private Double size;
    private String beakType;

    

    public abstract void makeSound();
}