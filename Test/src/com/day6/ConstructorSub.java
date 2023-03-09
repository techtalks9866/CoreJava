package com.day6;

public class ConstructorSub extends ConstructorSuper {

     int val;

    ConstructorSub(){
//        super();
//        this(123);
        System.out.println("no arg ConstructorSub");
    }

    ConstructorSub(int val){
        super(val);
//        this(val, 45);
        this.val = val;
        System.out.println("one arg ConstructorSub "+val );
    }

    ConstructorSub(int val, int val2){
        super(val);
        this.val = val;
        System.out.println("two arg ConstructorSub "+val+" "+ val2 );
    }
}
