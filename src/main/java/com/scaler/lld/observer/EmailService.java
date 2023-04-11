package com.scaler.lld.observer;

import com.scaler.lld.observer.interfaces.Observer;

public class EmailService implements Observer{

    @Override
    public void consume() {
        System.out.println("Sending Email.");
    }
    
}
