package com.day13;

public class AgeException extends Exception{
    private String message;

    public AgeException(String message) {
        super(message);
        this.message = message;
    }

}
