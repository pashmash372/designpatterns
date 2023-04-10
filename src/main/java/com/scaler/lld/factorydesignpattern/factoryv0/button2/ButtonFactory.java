package com.scaler.lld.factorydesignpattern.factoryv0.button2;
// Step 3 - Create Factory classes
public class ButtonFactory {
    //  Step 4- Create a static factory method
    // requirement 
    // Accept a parameter
    // return the product interface

    public static Button createButton(Platform platform,String id,Double radius,Double height,Double length){
        switch(platform){
            case ANDROID:
                return new RoundButton(id,radius);
            case MAC_OS:
                return new PrimaryButton(id,height,length);
            case iOS:
                return new RoundButton(id,radius);
            case WINDOWS:
                return new PrimaryButton(id,height,length);           
        }
        throw new RuntimeException("Invalid platform");
    }
}


// 1. Think of a design pattern which deals with a lot of arguments
// 2. Change return type from Button to ...
// 3 Allows you to add fields in consumer rather than in factory