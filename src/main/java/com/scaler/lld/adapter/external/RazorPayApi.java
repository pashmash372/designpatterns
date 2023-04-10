package com.scaler.lld.adapter.external;

import lombok.Getter;

// step 1 - incompatiable interfaces
@Getter
public class RazorPayApi {
    public void makePayment(String email,String phone){
        System.out.println("Making payment via razorpay");
    }
    public RazarPayStatus checkStatus(String paymentId){
        return RazarPayStatus.SUCCESS;
    }
}
