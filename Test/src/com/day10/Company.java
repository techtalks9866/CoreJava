package com.day10;
//COnstructor
//Access modifier
//Static vs nao-static
//if
//Object creation
//how to define method
public class Company {

    private static Company company;
    private String name;
    private String address;
    private String pin;

    private Company(String name, String address, String pin) {
        this.name = name;
        this.address = address;
        this.pin = pin;
    }

    public static Company getCompanyObject(){
        if(company == null){
            Company company1 = new Company("abc","hud","123");
            company = company1;
            return company;
        } else {
            return company;
        }
    }
}
