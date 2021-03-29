package com.epam.automation.javaerrorexceptions.exceptions;

public class EmptyFacultyException extends Exception {

    public EmptyFacultyException() {
        System.out.println("Faculty must have at least one group!");
    }

    public EmptyFacultyException(String message) {
        super(message);
    }

    public EmptyFacultyException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmptyFacultyException(Throwable cause) {
        super(cause);
    }
}
