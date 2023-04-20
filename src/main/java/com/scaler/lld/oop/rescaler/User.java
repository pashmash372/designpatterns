package com.scaler.lld.oop.rescaler;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class User {
    private String name;
    private String email;
    
    public void changeEmail(String email) {
        this.email = email;
    }
}
