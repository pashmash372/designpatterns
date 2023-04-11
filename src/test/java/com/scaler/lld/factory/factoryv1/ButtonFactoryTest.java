package com.scaler.lld.factory.factoryv1;

 
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.scaler.lld.factorydesignpattern.factoryv1.models.PrimaryButton;
import com.scaler.lld.factorydesignpattern.factoryv1.factorymethod.GenericButtonFactory;
import com.scaler.lld.factorydesignpattern.factoryv1.factorymethod.PrimaryButtonFactory;
import com.scaler.lld.factorydesignpattern.factoryv1.models.Button;

public class ButtonFactoryTest {
    
    private GenericButtonFactory factory;

     @Before
     public void setUp(){
        factory=new PrimaryButtonFactory();
     }

    @Test
    public void testFactoryMethod(){
        Button primary=factory.createButton();
        assertTrue("If platform is iOS,button should be round", primary instanceof PrimaryButton);
    }
}
