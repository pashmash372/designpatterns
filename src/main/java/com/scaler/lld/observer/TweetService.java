package com.scaler.lld.observer;

import com.scaler.lld.observer.interfaces.Observer;

public class TweetService implements Observer {
    @Override
    public void consume() {
        System.out.println("Tweet");
    }
}
