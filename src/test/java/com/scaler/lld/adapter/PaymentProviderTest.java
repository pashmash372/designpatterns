package com.scaler.lld.adapter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.scaler.lld.adapter.interfaces.PaymentProvider;
import com.scaler.lld.adapter.models.PaymentRequest;
import com.scaler.lld.adapter.models.PaymentStatus;

public class PaymentProviderTest {
    private PaymentProvider provider;

    @Before
    public void setUp(){
        provider= new RazorPayProvider();
        // provider= new StripeProvider();
    }
    
    @Test
    public void testPayment(){
        assertTrue("if razor pay is used instance should be of RazorPayProvider ", provider instanceof RazorPayProvider);
        provider.createPayment(PaymentRequest.builder()
                .email("test@gmail.com")
                .build()
        );
    }

    @Test
    public void testStatus(){
        PaymentStatus status= provider.verifyStatus("test");
        assertEquals("If test status is called , it should return success", PaymentStatus.SUCCESS,status);
    }
}
