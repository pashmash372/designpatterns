package com.scaler.lld.adapter.interfaces;

import com.scaler.lld.adapter.models.PaymentRequest;
import com.scaler.lld.adapter.models.PaymentStatus;

//  Step 2- create adapter interfaces
public interface PaymentProvider {
    public void createPayment(PaymentRequest request);
    public PaymentStatus verifyStatus (String paymentId);
}
