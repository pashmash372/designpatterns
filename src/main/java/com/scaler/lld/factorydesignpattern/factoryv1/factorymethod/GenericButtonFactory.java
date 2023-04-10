package com.scaler.lld.factorydesignpattern.factoryv1.factorymethod;

import com.scaler.lld.factorydesignpattern.factoryv1.models.Button;

//  Step 3 - Create factory interface
public interface GenericButtonFactory {
    public  Button createButton();
}
