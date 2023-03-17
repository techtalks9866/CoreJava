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
        FileInputStream file = null;
        try {

            file = new FileInputStream("/Desktop/GFG.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                file.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        // This file does not exist in the location
        // This constructor FileInputStream
        // throws FileNotFoundException which
        // is a checked exception
    }
}

