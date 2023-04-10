package com.scaler.lld.factorydesignpattern.abstractfactory.interfaces;

import com.scaler.lld.factorydesignpattern.abstractfactory.models.Button;
import com.scaler.lld.factorydesignpattern.abstractfactory.models.Checkbox;

// Step 3- create abstract factory interface
public interface FormFactory {
    // Step 3.5 - Add factory methods for products
    Button createButton();
    Checkbox createCheckBox();
    
}

// Example families
// Form - Btn,Checkbox,input
// Theme - Card,Box,Btn
// Database - Database,ConnectionPool,Driver