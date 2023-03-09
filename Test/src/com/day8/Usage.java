package com.day8;

import com.day7.ProtectedDemo;

public class Usage {
    public static void main(String[] args) {
        System.out.println(StaticVsNonStatic.i);
        StaticVsNonStatic.i = 30;
        StaticVsNonStatic.i = 40;
        System.out.println(StaticVsNonStatic.i);

        StaticVsNonStatic staticVsNonStatic1 = new StaticVsNonStatic();
        staticVsNonStatic1.j = 50;

        StaticVsNonStatic staticVsNonStatic2 = new StaticVsNonStatic();
        staticVsNonStatic2.j = 100;


        staticVsNonStatic1.j = 50;

        System.out.println(staticVsNonStatic1.j);

//        System.out.println(ProtectedDemo.j);
    }
}
