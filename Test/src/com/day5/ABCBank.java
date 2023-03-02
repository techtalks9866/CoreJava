package com.day5;

public abstract class ABCBank implements Bank{
    @Override
    public int getAmount() {
        return 1000;
    }

    abstract void test();
}
