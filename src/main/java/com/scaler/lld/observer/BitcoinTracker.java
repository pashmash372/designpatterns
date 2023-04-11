package com.scaler.lld.observer;

import java.util.ArrayList;
import java.util.List;

import com.scaler.lld.observer.interfaces.Observer;
import com.scaler.lld.observer.interfaces.Publisher;
import com.scaler.lld.observer.models.Bitcoin;

import lombok.AllArgsConstructor;

//  Step 3 - Add concrete publishers
@AllArgsConstructor
public class BitcoinTracker extends Publisher{

    private Bitcoin bitcoin;
    
    public void setPrice(Double value){
        bitcoin=bitcoin.toBuilder().value(value).build();
        publish();
    }
   

   
    
}
