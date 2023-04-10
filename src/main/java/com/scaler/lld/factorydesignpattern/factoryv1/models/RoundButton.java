package com.scaler.lld.factorydesignpattern.factoryv1.models;

// Step 2 - Concrete product classes

public class RoundButton extends Button{

    private Double radius;
    public RoundButton(String id,Double radius) {
        super(id);
    }

    @Override
    public void onClick() {
       
    }

    @Override
    public void render() {
       
    }
    
}
