package com.scaler.lld.factorydesignpattern.factoryv0.button2;

import lombok.AllArgsConstructor;

// Step 1 - Create product interface
@AllArgsConstructor
public abstract class  Button {
    private String id;
    public abstract void onClick();
    public abstract void render();    
}
