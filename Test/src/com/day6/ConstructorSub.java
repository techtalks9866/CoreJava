package com.day6;

public class ConstructorSub extends ConstructorSuper {

    private int val;

    ConstructorSub(){
        this(123);
        System.out.println("no arg ConstructorSub");
    }

    ConstructorSub(int val){
        System.out.println("one arg ConstructorSub "+val );
    }
}
