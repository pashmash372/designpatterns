package com.scaler.lld.adapter.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class PaymentRequest {
    //  DTO
    private String phoneNumber;
    private String email;
    private String name;
}
