package com.scaler.lld.factorydesignpattern.factoryv0.button1;

// Step 3 - Create Factory classes
public class ButtonFactory {
    //  Step 4- Create a static factory method
    // requirement 
    // Accept a parameter
    // return the product interface

    public static Button createButton(Platform platform){
        switch(platform){
            case ANDROID:
                return new RoundButton();
            case MAC_OS:
                return new PrimaryButton();
            case iOS:
                return new RoundButton();            
        }
        throw new RuntimeException("Invalid platform");
    }
}
