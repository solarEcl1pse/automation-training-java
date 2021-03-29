package com.epam.automation.javaerrorexceptions.models;

import com.epam.automation.javaerrorexceptions.exceptions.NegativeGradeException;
import com.epam.automation.javaerrorexceptions.exceptions.NoCourseException;
import com.epam.automation.javaerrorexceptions.models.enums.Courses;

import java.util.HashMap;

public class Student {

    private final HashMap<Courses, Integer> grades;

    public Student(HashMap<Courses, Integer> grades) throws NegativeGradeException, NoCourseException {
        if (grades.values().stream().anyMatch(grade -> (grade < 0) || (grade > 10))) {
            throw new NegativeGradeException();
        } else if (grades.keySet().isEmpty()) {
            throw new NoCourseException();
        } else {
            this.grades = grades;
        }
    }

    public HashMap<Courses, Integer> getGrades() {
        return grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "grades=" + grades +
                '}';
    }
}
