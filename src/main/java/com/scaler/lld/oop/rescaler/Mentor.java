package com.scaler.lld.oop.rescaler;

import lombok.Getter;

@Getter

public class Mentor extends User {

    private Double experience;

    public Mentor(String name, String email, Double experience) {
        super(name, email);
        this.experience = experience;
    }

}
