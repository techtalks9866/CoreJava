package com.day6;

public class Constructordemo {
    public int val;

    private Constructordemo() {
        System.out.println("No arg constructor");
    }

    private Constructordemo(int val) {
        this.val = val;
    }
}
