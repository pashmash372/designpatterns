package com.scaler.lld.oop.passwordabstract;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AbstractPasswordEncoderTest {
    @Test
    public void testEncoder(){
        AbstractPasswordEncoder encoder= new SubstringEncoder("public");
        String encoded=encoder.encode("abc");
        String expected="abpublic";
        assertEquals("If encoder is called , substring + key should be returned", expected, encoded);
    }

    @Test
    public void testStatic(){
        AbstractPasswordEncoder encoder1= new SubstringEncoder("public");
        // encoder1.KEY_PREFIX="PUBLIC_01";
        AbstractPasswordEncoder encoder2= new SubstringEncoder("public");
        // encoder2.KEY_PREFIX="PUBLIC_02";
        System.out.println(AbstractPasswordEncoder.KEY_PREFIX);
        System.out.println(encoder1.KEY_PREFIX +" "+encoder2.KEY_PREFIX);
    }

    @Test
    public void testStaticMethod(){
        AbstractPasswordEncoder.printKey();
    }
}
