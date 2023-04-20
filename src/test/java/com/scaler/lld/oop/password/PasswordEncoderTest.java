package com.scaler.lld.oop.password;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PasswordEncoderTest {
    @Test
    public void testPasswordEncoder(){
        PasswordEncoder encoder= new ReverseEncoder();
        String encoded= encoder.encode("malayalam");
        assertEquals("If reverse encoder is used it should return the reversed string", "malayalam", encoded);
    }

    @Test
    public void testDefaultPasswordEncoder(){
        PasswordEncoder encoder= new DefaultEncoder();
        String encoded= encoder.encode("abhil");
        assertEquals("If reverse encoder is used it should return the reversed string", "abhil", encoded);
    }
}
