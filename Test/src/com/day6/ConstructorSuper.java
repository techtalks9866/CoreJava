package com.day6;

public class ConstructorSuper {

    private int val;

     ConstructorSuper(){
//        super(123);
        System.out.println("no arg Constructor super class");
    }

    ConstructorSuper(int val){
        System.out.println("one arg Constructor super class "+val );
    }

    ConstructorSuper(int val, int val2){
        System.out.println("one arg Constructor super class "+val );
    }
}
