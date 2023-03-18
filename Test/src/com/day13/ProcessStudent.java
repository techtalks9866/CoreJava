package com.day13;

import com.day1.Student;

public class ProcessStudent {
    public String process(Student student) throws AgeException {
        if (student.getAge() < 18) {
            AgeException ageException = new AgeException("age is less");
            throw ageException;
        } else {
            return "process application";
        }
    }

}
