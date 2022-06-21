package com.sprintboot.com.apispringboottestapplication.exception;

public class UserNotFoundException  extends Exception{
    public UserNotFoundException(String message) {
        super(message);
    }
}