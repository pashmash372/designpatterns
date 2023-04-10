package com.scaler.lld.abstractfactory;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.scaler.lld.factorydesignpattern.abstractfactory.interfaces.DarkFormFactory;
import com.scaler.lld.factorydesignpattern.abstractfactory.interfaces.FormFactory;
import com.scaler.lld.factorydesignpattern.abstractfactory.models.Button;
import com.scaler.lld.factorydesignpattern.abstractfactory.models.Checkbox;
import com.scaler.lld.factorydesignpattern.abstractfactory.models.DarkButton;
import com.scaler.lld.factorydesignpattern.abstractfactory.models.DarkCheckbox;

public class FormFactoryTest {
    private FormFactory factory;

    @Before
    public void setUp(){
        factory= new DarkFormFactory();
    }
    @Test
    public void testFormFactory(){
        Button darkBtn= factory.createButton();
        Checkbox darCheckbox=factory.createCheckBox();

        assertTrue("If button factory is called ,btn should be dark", darkBtn instanceof DarkButton);
        assertTrue("If checkbox factory is called ,checkbox should be dark", darCheckbox instanceof DarkCheckbox);
    }
}

