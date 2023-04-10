package com.scaler.lld.factorydesignpattern.abstractfactory.interfaces;

import com.scaler.lld.factorydesignpattern.abstractfactory.models.Button;
import com.scaler.lld.factorydesignpattern.abstractfactory.models.Checkbox;
import com.scaler.lld.factorydesignpattern.abstractfactory.models.LightButton;
import com.scaler.lld.factorydesignpattern.abstractfactory.models.LightCheckbox;

public class LightFormFactory implements FormFactory{

    @Override
    public Button createButton() {
        return new LightButton();        
    }

    @Override
    public Checkbox createCheckBox() {
        return new LightCheckbox();
    }
    
}
