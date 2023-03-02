package com.day4;

public interface Bank {
    int getAmount();
    void credit(int amount);
    void debit(int amount);
    String getName();
}
