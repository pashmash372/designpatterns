package com.scaler.lld.decorator;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.scaler.lld.decorator.intefaces.Database;

public class DatabaseTest {
    private Database database = null;

    @Before
    public void setUp(){
        database=new SimpleDatabase();
    }
    @Test
    public void testBase(){
        String value=database.read();
        assertEquals("If base datasource is used, it should return Base", "Base",value);
    }
    @Test
    public void testCompression(){
        Database compressed= new CompressionDecorator(database);
        String value=compressed.read();
        assertEquals("If compress datasource is used, it should return Base", "Base - Decompress",value);
    }

    @Test
    public void testEncryption() {        
        Database encrypted= new EncryptionDecorator(database);
        String value = encrypted.read();
        assertEquals("If compressed  data source is used , it should return Base ", "Base - Decrypted", value);
    } 

    @Test
    public void testCompressionAndEncryption() {
        Database db = new EncryptionDecorator(new CompressionDecorator(database));
        String value = db.read();
        assertEquals("If compressed  data source is used , it should return Base ", "Base - Decompress - Decrypted", value);
    }

    @Test
    public void testEncyptionAndCompression() {
        Database db = new CompressionDecorator(new EncryptionDecorator(database));
        String value = db.read();
        assertEquals("If compressed  data source is used , it should return Base ", "Base - Decrypted - Decompress", value);
    }
}

