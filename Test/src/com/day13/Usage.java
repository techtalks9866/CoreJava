package com.day13;

import com.day1.Student;

public class Usage {
    public static void main(String[] args) {
        ProcessStudent processStudent = new ProcessStudent();
        try {
            processStudent.process(new Student());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
