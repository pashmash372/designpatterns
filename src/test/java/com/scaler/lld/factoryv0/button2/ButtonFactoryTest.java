package com.scaler.lld.factoryv0.button2;

 
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.scaler.lld.factorydesignpattern.factoryv0.button2.Button;
import com.scaler.lld.factorydesignpattern.factoryv0.button2.ButtonFactory;
import com.scaler.lld.factorydesignpattern.factoryv0.button2.Platform;
import com.scaler.lld.factorydesignpattern.factoryv0.button2.RoundButton;

public class ButtonFactoryTest {
    
    @Test
    public void testButton(){
        // Button round = new RoundButton();
        Button round = ButtonFactory.createButton(Platform.iOS,"#btn",0.0,0.0,0.0);
        assertTrue("if platform is iOS,button should be round",round instanceof RoundButton);
    }
}
