package com.epam.automation.javaerrorexceptions.exceptions;

public class EmptyGroupException extends Exception {

    public EmptyGroupException() {
        System.out.println("Group must have at least one student!");
    }

    public EmptyGroupException(String message) {
        super(message);
    }

    public EmptyGroupException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmptyGroupException(Throwable cause) {
        super(cause);
    }
}
