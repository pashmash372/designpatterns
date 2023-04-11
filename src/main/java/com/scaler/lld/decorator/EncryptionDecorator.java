package com.scaler.lld.decorator;

import com.scaler.lld.decorator.intefaces.Database;

import lombok.AllArgsConstructor;

@AllArgsConstructor
// Step 4 - Implement concrete decorators
public class EncryptionDecorator implements  Database {

    private Database database;

    @Override
    public String read() {
        String value = database.read();
        return decrypt(value);        
    }

    private String decrypt(String value) {
        return value+" - Decrypted";
    }

    @Override
    public void write(String value) {
        String encrypt=encrypt(value);
        database.write(encrypt);
    }

    private String encrypt(String value) {
        return "Encrypted";
    }

    
}
