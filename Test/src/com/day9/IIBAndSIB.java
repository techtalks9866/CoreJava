package com.day9;

public class IIBAndSIB {

    final static int i;


    //Instance initialization block
    {
        System.out.println("IIB");
    }
    //static initialization block
    static {
        System.out.println("SIB code");
//        ...
        i = (20 +30)/40;
    }

    public IIBAndSIB() {
        System.out.println("I am default");
    }

    public IIBAndSIB(int i) {
        this();
        System.out.println("I am constructor " + i);
    }

    public static void main(String[] args) {
        IIBAndSIB iibAndSIB = new IIBAndSIB(2);
        IIBAndSIB iibAndSIB1 = new IIBAndSIB();

    }

}
