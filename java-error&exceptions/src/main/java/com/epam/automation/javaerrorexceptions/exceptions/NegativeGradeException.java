package com.epam.automation.javaerrorexceptions.exceptions;

public class NegativeGradeException extends Exception {

    public NegativeGradeException() {
        System.out.println("Grade can't be below 0 or above 10!");
    }

    public NegativeGradeException(String message) {
        super(message);
    }

    public NegativeGradeException(String message, Throwable cause) {
        super(message, cause);
    }

    public NegativeGradeException(Throwable cause) {
        super(cause);
    }
}
