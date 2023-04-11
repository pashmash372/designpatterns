package com.scaler.lld.decorator;

import com.scaler.lld.decorator.intefaces.Database;

//  Step 2- base product implementation
public class SimpleDatabase implements Database{

    @Override
    public String read() {
       return "Base";
    }

    @Override
    public void write(String val) {
        System.out.println(val);
    }
    
}
