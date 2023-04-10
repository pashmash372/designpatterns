package com.scaler.lld.factorydesignpattern.factoryv1.factorymethod;

import com.scaler.lld.factorydesignpattern.factoryv1.models.Button;
import com.scaler.lld.factorydesignpattern.factoryv1.models.PrimaryButton;

public class PrimaryButtonFactory implements GenericButtonFactory {

    @Override
    public Button createButton() {        
        return new PrimaryButton(null, null, null);
    }
    
}
