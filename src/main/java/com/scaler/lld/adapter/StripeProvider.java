package com.scaler.lld.adapter;

import com.scaler.lld.adapter.external.StripeApi;
import com.scaler.lld.adapter.external.StripeStatus;
import com.scaler.lld.adapter.interfaces.PaymentProvider;
import com.scaler.lld.adapter.models.PaymentRequest;
import com.scaler.lld.adapter.models.PaymentStatus;

public class StripeProvider implements PaymentProvider{

    private StripeApi api=new StripeApi();
    @Override
    public void createPayment(PaymentRequest request) {
        api.pay(request.getEmail());
    }

    @Override
    public PaymentStatus verifyStatus(String paymentId) {
        return toStatus(api.checkStatus(paymentId));        
    }

    private PaymentStatus toStatus(StripeStatus checkStatus) {
        if(checkStatus==StripeStatus.OK)
        {
            return PaymentStatus.SUCCESS;
        }
        return PaymentStatus.ERROR;
    }
    
}
