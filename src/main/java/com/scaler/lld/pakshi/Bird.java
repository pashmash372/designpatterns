package com.scaler.lld.pakshi;

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

    // Step 2 - Add behaviours
    public abstract void fly();

    public abstract void makeSound();
}