package com.scaler.lld.adapter.external;

import lombok.Getter;

@Getter
public class StripeApi {
    
    public void pay(String email){
        System.out.println("Making payment via stripe");
    }
    
    public StripeStatus checkStatus(String paymentId){
        return StripeStatus.OK;
    }
}


