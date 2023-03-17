package com.day12;

public class Usage {
    public static void main(String[] args) {
        Color yellow = new Color(1,2,0);
        Color yeloow1 = yellow;
        Color lightyellow = new Color(yellow.getRed(), yellow.getGreen(), 1);

        String test =  "I am test String";
        String test1 = "I am test String";

        test = "I am test String2";

//        System.out.println(test);
//        System.out.println(test.trim());
//        test = test.trim();
//        System.out.println(test);
//        System.out.println(test.hashCode());
//        System.out.println(test1.hashCode());
//
//        System.out.println(test.equals(test1));

        String s1 = new String("first String");
        String s2 = new String("first String");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        System.out.println(s1.equals(s2));

        System.out.println(s1.toString());

        StringBuffer stringBuffer = new StringBuffer("I am buffer value");
        System.out.println(stringBuffer);
        stringBuffer.append("added value");
        System.out.println(stringBuffer);







    }

    void PaintLeftWall(){

    }

    void ceiling(){

    }
}
