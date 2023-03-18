package com.day1;

public class Student {

    int id;
    String sirName;
    String firstname;
    String lastName;

    Address address;

    int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //    this is a java keyword, and it equals to whetevr object you used to call current method.
    String getFullName(){
        String firstname = "I am local FirstName ";
        String fullName = this.sirName + this.firstname + this.lastName;
        return fullName;
    }
}
