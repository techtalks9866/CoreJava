package com.day7;

public class Usage2 {

    static Bank bank = new Bank() {
        @Override
        public void printName() {

        }
    };
    public static void main(String[] args) {
        InnerClasses innerClasses = new InnerClasses();
        InnerClasses.Java_Inner_class javaInnerClass =   innerClasses.new Java_Inner_class();
        javaInnerClass.test();

        System.out.println(                                   InnerClasses.i);
        InnerClasses.StaticNestedClass staticNestedClass =new InnerClasses.StaticNestedClass();
        staticNestedClass.test();


//        Bank bank2 = new Bank() {
//            @Override
//            public void printName() {
//
//            }
//        };
//
//
//        Usage2.bank.printName();
//
//        bank2.printName();





    }
}
