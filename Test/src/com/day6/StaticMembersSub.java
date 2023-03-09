package com.day6;

public class StaticMembersSub extends StaticMembers{

     static double tempCoverter(double fahrenheit){
        // calculate celsius temperature
        double celsius = (fahrenheit - 32) / 1.8;
        return celsius;
    }
}
