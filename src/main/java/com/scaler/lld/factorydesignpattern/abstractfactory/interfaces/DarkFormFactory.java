package com.scaler.lld.factorydesignpattern.abstractfactory.interfaces;

import com.scaler.lld.factorydesignpattern.abstractfactory.models.Button;
import com.scaler.lld.factorydesignpattern.abstractfactory.models.Checkbox;
import com.scaler.lld.factorydesignpattern.abstractfactory.models.DarkButton;
import com.scaler.lld.factorydesignpattern.abstractfactory.models.DarkCheckbox;

public class DarkFormFactory implements FormFactory{

    @Override
    public Button createButton() {
        return new DarkButton();        
    }

    @Override
    public Checkbox createCheckBox() {
        return new DarkCheckbox();
    }
    
}
