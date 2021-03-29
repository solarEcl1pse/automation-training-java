package com.epam.automation.javaerrorexceptions.exceptions;

public class EmptyUniversityException extends Exception {

    public EmptyUniversityException() {
        System.out.println("University must have at least one faculty!");
    }

    public EmptyUniversityException(String message) {
        super(message);
    }

    public EmptyUniversityException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmptyUniversityException(Throwable cause) {
        super(cause);
    }
}
