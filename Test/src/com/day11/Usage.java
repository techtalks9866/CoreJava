package com.day11;

public class Usage {
    public static void main(String[] args) {
//        ToStringFunctionality toStringFunctionality = new ToStringFunctionality();
//        System.out.println(toStringFunctionality.toString());

        HashCodeClass code = new HashCodeClass();
        HashCodeClass code2 = new HashCodeClass();
        System.out.println(code.hashCode()   +" : "+ code.toString());
        System.out.println(code2.hashCode()   +" : "+ code2.toString());

        Equals equals = new Equals();
        Equals equals2 = equals;

        // It will uniuqe , Integer
        // compare
        // equls checks memory not hash code

        Integer i = 20;
        Integer j = 20;
        System.out.println(i.equals(j));
        System.out.println(i.toString());
        System.out.println(i.hashCode());


        String val = new String("test");
        System.out.println(val.toString());
        System.out.println(val.hashCode());



    }
}
