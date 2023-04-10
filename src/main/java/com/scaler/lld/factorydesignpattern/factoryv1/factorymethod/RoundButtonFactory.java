package com.scaler.lld.factorydesignpattern.factoryv1.factorymethod;

import com.scaler.lld.factorydesignpattern.factoryv1.models.Button;
import com.scaler.lld.factorydesignpattern.factoryv1.models.RoundButton;


// Step 4 - create concrete factory classes
public class RoundButtonFactory implements GenericButtonFactory {

    @Override
    public Button createButton() {
        return new RoundButton(null, null);
    }
    
}
