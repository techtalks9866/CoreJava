package com.day2;

public class Usage {
    public static void main(String[] args) {
        EncapsulationBank encapsulationBank = new EncapsulationBank();
//        encapsulationBank.account = 123;
        encapsulationBank.setAccount(123);
        encapsulationBank.setAmount(1000);
        encapsulationBank.setAddress("Chicago");
        encapsulationBank.setName("Test User");

        System.out.println(encapsulationBank.getAccount());
        System.out.println(encapsulationBank.getAmount());
        System.out.println(encapsulationBank.getAddress());
        System.out.println(encapsulationBank.getName());


//        encapsulationBank.method();


    }
}
