package com.scaler.lld.oop.rescaler;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class StudentTest {

    @Test
    public void testStudentInstance(){
        Student student= new Student(); // Default constructor        
        assertNotNull("if default ctor is called ,the instance must not be null", student);
        assertNull("if ctor is called , the name must be null", student.getName());        
        assertEquals("If default ctor is called,the status should be ACTIVE,", StudentStatus.ACTIVE, student.getStatus());
        


    }
}
