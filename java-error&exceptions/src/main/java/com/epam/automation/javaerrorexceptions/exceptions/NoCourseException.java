package com.epam.automation.javaerrorexceptions.exceptions;

public class NoCourseException extends Exception {

    public NoCourseException() {
        System.out.println("Student must have at least one course!");
    }

    public NoCourseException(String message) {
        super(message);
    }

    public NoCourseException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoCourseException(Throwable cause) {
        super(cause);
    }
}
