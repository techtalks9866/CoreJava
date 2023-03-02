package com.day5;

import com.day6.Constructordemo;

public class Usage {
    public static void main(String[] args) {
//        Bank abstractClass = new AbstractClass();
//        abstractClass.credit();
//
//
//        Bank bank = new ConcreteClass();
//        bank.getAmount();
//
//
//
//
//
//        Constructordemo constructordemo = new Constructordemo();
//        Constructordemo constructordemo1 = new Constructordemo(123);
//
//        //Instance of
//        ConcreteClass concreteClass = (ConcreteClass) bank;
//        System.out.println(bank instanceof ConcreteClass);
        Bank abcBank = new ABCBank() {
            @Override
            public void credit(int amount) {

            }

            @Override
            void test() {

            }
        };
        System.out.println(abcBank.getAmount());
    }
}
