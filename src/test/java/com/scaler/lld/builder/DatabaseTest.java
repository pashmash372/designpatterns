package com.scaler.lld.builder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class DatabaseTest {

    @Test
    public void testConstructor() {
        Database database = new Database("localhost", 4533, "password", "username", 1L, DatabaseType.MY_SQL);

        assertNotNull("If ctor is called object should not null", database);
    }

    @Test(expected = RuntimeException.class)
    public void testInvalidPort() {
        Database database = new Database("localhost", 20001, "password", "username", 1L, DatabaseType.MONGO);
    }

    @Test
    public void testSetters() {
        Database database = new Database();
        database.setHost("localhost");
        database.setPort(4553);
        assertEquals("if host setter is called host should be localhost", "localhost", database.getHost());
    }

    @Test
    public void testHashMapCtor() {
        Map<String, Object> values = new HashMap<>();
        values.put("host", "localhost");
        values.put("port", 3306);
        values.put("type", DatabaseType.MY_SQL);

        Database database = new Database(values);
        assertEquals("If host setter is called host should be localhost", "localhost", database.getHost());
        assertEquals("If ctor is called type should be MYSQL", DatabaseType.MY_SQL, database.getType());
    }

    @Test
    public void testBuilder() {
        Datastore builder = Datastore.builder().withHost("localhost").mysql().build();

        assertEquals("If host setter is called host should be localhost", "localhost", builder.getHost());
        assertEquals("If type setter  is called type should be MYSQL", DatabaseType.MY_SQL, builder.getType());
    }

    @Test(expected = RuntimeException.class)
    public void testBuilderWithNoHost() {
        Datastore builder = Datastore.builder().build();
    }

    @Test(expected = RuntimeException.class)
    public void testBuilderWithNoType() {
        Datastore builder = Datastore.builder().build();
    }

}
