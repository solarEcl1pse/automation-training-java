package com.epam.automation.javaerrorexceptions.service;

import com.epam.automation.javaerrorexceptions.exceptions.EmptyFacultyException;
import com.epam.automation.javaerrorexceptions.exceptions.EmptyGroupException;
import com.epam.automation.javaerrorexceptions.exceptions.EmptyUniversityException;
import com.epam.automation.javaerrorexceptions.models.Faculty;
import com.epam.automation.javaerrorexceptions.models.Group;
import com.epam.automation.javaerrorexceptions.models.Student;
import com.epam.automation.javaerrorexceptions.models.University;
import com.epam.automation.javaerrorexceptions.models.enums.Courses;

public class AverageGradeCalculator {

    public void calculateStudentAverageGrade(Student student) {
        int averageGrade = 0;
        for (Integer grade : student.getGrades().values()) {
            averageGrade += grade;
        }
        averageGrade = averageGrade / student.getGrades().values().size();
        System.out.println("Student's average grade is " + averageGrade + ".");
    }

    public void calculateCourseAverageGradeOfGivenGroup(Courses course, Group group) throws EmptyGroupException {
        if (group.getStudents().isEmpty()) {
            throw new EmptyGroupException();
        }
        int averageGrade = 0;
        int counter = 0;
        for (Student student : group.getStudents()) {
            if (student.getGrades().containsKey(course)) {
                averageGrade += student.getGrades().get(course);
                counter++;
            }
        }
        averageGrade = averageGrade / counter;
        System.out.println("Average " + group + " grade for the course " + course + " is " + averageGrade + ".");
    }

    public void calculateCourseAverageGrade(Courses course, University university) throws EmptyFacultyException, EmptyUniversityException {
        if (university.getFaculties().isEmpty()) {
            throw new EmptyUniversityException();
        }
        int averageGrade = 0;
        int counter = 0;
        for (Faculty faculty : university.getFaculties()) {
            if (faculty.getGroups().isEmpty()) {
                throw new EmptyFacultyException();
            }
            for (Group group : faculty.getGroups()) {
                for (Student student : group.getStudents()) {
                    if (student.getGrades().containsKey(course)) {
                        averageGrade += student.getGrades().get(course);
                        counter++;
                    }
                }
            }
        }
        averageGrade = averageGrade / counter;
        System.out.println("Average grade for the course " + course + " is " + averageGrade + ".");
    }
}
