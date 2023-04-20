package com.scaler.lld.oop.password;

public class DefaultEncoder implements PasswordEncoder{

    @Override
    public String encode(String password) {
        return password;
    }
    
}
