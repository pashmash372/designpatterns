package com.scaler.lld.decorator;

import com.scaler.lld.decorator.intefaces.Database;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CompressionDecorator implements Database{

    private Database database;
    @Override
    public String read() {
        String value= database.read();
        return decompress(value);        
    }

    private String decompress(String value) {
        return value+" - Decompress";
    }

    @Override
    public void write(String value) {
        String compressed= compress(value);
        database.write(compressed);
    }

    private String compress(String value) {
        return "Compressed";
    }
    
}
