package com.day4;

public class Usage {
    public static void main(String[] args) {
        PolymorpismSub polymorpismSub = new PolymorpismSub();
        System.out.println(polymorpismSub.add(1,2));
        System.out.println(polymorpismSub.add(1,2,3));

        polymorpismSub.superMethod();
    }
}
