package com.scaler.lld.strategy;

import org.junit.Test;

public class NavigatorTest {

    @Test
    public void testBike() {
        Navigator navigator = new Navigator(new BikeNavigationStrategy());
        navigator.navigate("null", "null");
    }

    @Test
    public void testCar() {
        Navigator navigator = new Navigator(new CarNavigationStrategy());
        navigator.navigate("null", "null");
    }


}