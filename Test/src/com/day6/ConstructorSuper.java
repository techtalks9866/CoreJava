package com.day6;

public class ConstructorSuper {

    private int val;

    ConstructorSuper(){
//        super(123);
        System.out.println("no arg ConstructorSub");
    }

    ConstructorSuper(int val){
        System.out.println("one arg ConstructorSub "+val );
    }
}
