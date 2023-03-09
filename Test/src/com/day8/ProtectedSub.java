package com.day8;

import com.day7.ProtectedDemo;

public class ProtectedSub extends ProtectedDemo {

    public static void main(String[] args) {
//        ProtectedDemo protectedDemo =new ProtectedDemo();
//        protectedDemo.i = 25;

        ProtectedSub protectedSub = new ProtectedSub();
        protectedSub.i = 20;

        protectedSub.test();

        System.out.println(ProtectedDemo.j);
    }
}
