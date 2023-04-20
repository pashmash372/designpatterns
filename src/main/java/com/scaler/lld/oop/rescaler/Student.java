package com.scaler.lld.oop.rescaler;

import lombok.Getter;

@Getter
public class Student extends User {

    private String batchName;
    private Double psp;
    private StudentStatus status = StudentStatus.ACTIVE;

    

    public Student(String name, String email, String batchName, Double psp, StudentStatus status) {

        super(name, email);

        if (psp > 100 || psp < 0) {
            throw new IllegalArgumentException("psp should be b/w 0 and 100");
       
        }

        this.batchName = batchName;
        this.psp = psp;
        this.status = status;
    }

    public StudentStatus changeStatus(StudentStatus newStatus) {
        // If done , don't change
        if (this.status == StudentStatus.DONE) {
            return StudentStatus.ACTIVE;
        }
        this.status = newStatus;
        return this.status;
    }

}
