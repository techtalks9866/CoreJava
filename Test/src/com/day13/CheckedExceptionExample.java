package com.day13;

// Java Program to Handle Checked Exception
// Where FileInputStream Exception is thrown

// Importing required classes
import java.io.*;

// Main class
public class CheckedExceptionExample {

    // Main driver method
    public static void main(String args[]) {

        // Reading content from file by passing local directory path
        // where file should exists
        try {
            new CheckedExceptionExample().test();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void test() throws FileNotFoundException {
        FileInputStream file  = new FileInputStream("/Desktop/GFG.txt");
    }

    public void test2() throws FileNotFoundException {
        test();
    }
}

