package com.scaler.lld.factory.factoryv0.button;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.scaler.lld.factorydesignpattern.factoryv0.button1.Button;
import com.scaler.lld.factorydesignpattern.factoryv0.button1.ButtonFactory;
import com.scaler.lld.factorydesignpattern.factoryv0.button1.Platform;
import com.scaler.lld.factorydesignpattern.factoryv0.button1.RoundButton;

public class ButtonFactoryTest {
    
    @Test
    public void testButton(){
        // Button round = new RoundButton();
        Button round = ButtonFactory.createButton(Platform.iOS);
        assertTrue("if platform is iOS,button should be round",round instanceof RoundButton);
    }
}
