package com.scaler.lld.factorydesignpattern.factoryv1.models;

import lombok.AllArgsConstructor;

// Step 1 - Create product interface
@AllArgsConstructor
public abstract class  Button {
    private String id;
    public abstract void onClick();
    public abstract void render();    
}
