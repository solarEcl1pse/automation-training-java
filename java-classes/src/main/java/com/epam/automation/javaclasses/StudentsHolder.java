package com.epam.automation.javaclasses;

import com.epam.automation.javaclasses.enums.Course;
import com.epam.automation.javaclasses.enums.Faculty;
import com.epam.automation.javaclasses.enums.Group;

import java.time.LocalDate;

/**
 * Создать массив объектов. Вывести:
 * a) список студентов заданного факультета;
 * b) списки студентов для каждого факультета и курса;
 * c) список студентов, родившихся после заданного года;
 * d) список учебной группы.
 */
public class StudentsHolder {

    private Student[] students;

    public StudentsHolder() {
    }

    public StudentsHolder(Student... student) {
        this.students = student;
    }

    public void getStudentsOfAGivenFaculty(Faculty faculty) {
        System.out.println("List of students of the " + faculty.toString() + " faculty:");
        for (Student student : students) {
            if (student.getFaculty().equals(faculty)) {
                System.out.println(student.toString());
            }
        }
    }

    public void getStudentsForEachFacultyAndCourse() {
        for (Faculty faculty : Faculty.values()) {
            System.out.println("List of students of the " + faculty.toString() + " faculty:");
            for (Course course : Course.values()) {
                System.out.println(course + " course:");
                for (Student student : students) {
                    if (student.getFaculty().equals(faculty) && student.getCourse().equals(course)) {
                        System.out.println(student.toString());
                    }
                }
            }
        }
    }

    public void getStudentsBornAfterAGivenYear(int year) {
        System.out.println("List of students born after " + year + ":");
        for (Student student : students) {
            if (student.getBirthdate().isAfter(LocalDate.of(year, 1, 1))) {
                System.out.println(student.toString());
            }
        }
    }

    public void getStudentsOfAGivenGroup(Group group) {
        System.out.println(group.toString() + " list:");
        for (Student student : students) {
            if (student.getGroup().equals(group)) {
                System.out.println(student.toString());
            }
        }
    }
}

