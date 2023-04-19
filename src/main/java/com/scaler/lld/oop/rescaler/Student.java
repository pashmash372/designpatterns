package com.scaler.lld.oop.rescaler;

import lombok.Getter;

@Getter
public class Student {

    private Long id;
    private String name;
    private String email;
    private String batchName;
    private Double psp;
    private StudentStatus status = StudentStatus.ACTIVE;

    public StudentStatus changeStatus(StudentStatus newStatus) {
        // If done , don't change
        if (this.status == StudentStatus.DONE) {
            return StudentStatus.ACTIVE;
        }
        this.status = newStatus;
        return this.status;
    }

}
