package com.day11;

public class Usage2 {
    public static void main(String[] args) {
        Person p1 = new Person("Rohit","USA");

        Person p2 = new Person("Naveen", "India");

        Person p3 = new Person("Naveen", "AP");

        System.out.println(p1.toString());
        System.out.println(p2.toString());

        System.out.println(p2.equals(p3));
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());
        System.out.println(p1.hashCode());
    }
}
