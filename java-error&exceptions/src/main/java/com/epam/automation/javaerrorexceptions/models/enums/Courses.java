package com.epam.automation.javaerrorexceptions.models.enums;

public enum Courses {

    MATHEMATICS("Mathematics"), ARCHITECHTURE("Architecture"), ENGLISH("English");

    private final String title;

    Courses(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "\"" + title + "\"";
    }
}
