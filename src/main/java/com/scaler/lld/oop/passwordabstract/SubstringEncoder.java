package com.scaler.lld.oop.passwordabstract;

public class SubstringEncoder extends AbstractPasswordEncoder{

    public SubstringEncoder(String publicKey) {
        super(publicKey);        
    }

    @Override
    public String encode(String password) {
        
        return password.substring(0, 2)+getPublicKey();
    }
    
}
