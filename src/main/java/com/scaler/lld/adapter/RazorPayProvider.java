package com.scaler.lld.adapter;

import com.scaler.lld.adapter.external.RazarPayStatus;
import com.scaler.lld.adapter.external.RazorPayApi;
import com.scaler.lld.adapter.interfaces.PaymentProvider;
import com.scaler.lld.adapter.models.PaymentRequest;
import com.scaler.lld.adapter.models.PaymentStatus;

// Step 3 - Concrete adapters
public class RazorPayProvider implements PaymentProvider {

    private RazorPayApi api = new RazorPayApi();
    @Override
    public void createPayment(PaymentRequest request) {
        api.makePayment(request.getEmail(), request.getPhoneNumber());
    }

    @Override
    public PaymentStatus verifyStatus(String paymentId) {
        RazarPayStatus  status = api.checkStatus(paymentId);
        return toStatus(status);
    }

    private PaymentStatus toStatus(RazarPayStatus status) {
        if(status==RazarPayStatus.SUCCESS){
            return PaymentStatus.SUCCESS;
        }
        return PaymentStatus.ERROR;

    }
    
}
