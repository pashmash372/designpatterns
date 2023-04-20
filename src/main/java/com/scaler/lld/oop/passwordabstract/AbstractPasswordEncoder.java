package com.scaler.lld.oop.passwordabstract;

import lombok.AllArgsConstructor;

// Step 1 - add abstract to class declaration
@AllArgsConstructor
public abstract class AbstractPasswordEncoder {

    // Step 2 - Add state
    private String publicKey;
    static final String KEY_PREFIX = "PUBLIC";

    // Step 3 - Add methods with implementation
    public String getPublicKey() {
        return publicKey;
    }

    // Step 4 - Declare methods without implementations as abstract
    public abstract String encode(String password);

    public static void printKey(){
        System.out.println(KEY_PREFIX);
    }
}
