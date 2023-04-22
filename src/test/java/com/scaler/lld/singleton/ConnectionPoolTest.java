package com.scaler.lld.singleton;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class ConnectionPoolTest {

    @Test
    public void testSingleton() {
        ConnectionPool connectionPool = ConnectionPool.getInstance();
        assertNotNull("If get instance is called , instance shoudl not be null ", connectionPool);
        
        ConnectionPool connectionPool2= ConnectionPool.getInstance();
        assertEquals("If getInstance is called twice it should return the same instance", connectionPool, connectionPool2);
    }
}
