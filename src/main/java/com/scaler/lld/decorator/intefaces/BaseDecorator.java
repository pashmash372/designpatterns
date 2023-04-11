package com.scaler.lld.decorator.intefaces;

import lombok.AllArgsConstructor;

//  Step 3- create base decorator implementing product interface
@AllArgsConstructor
public class BaseDecorator implements Database{

    private Database database;

    @Override
    public String read() {
        return database.read();
    }

    @Override
    public void write(String value) {
        database.write(value);
    }
    
}
