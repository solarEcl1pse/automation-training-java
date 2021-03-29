package com.epam.automation.javaerrorexceptions;

import com.epam.automation.javaerrorexceptions.exceptions.EmptyFacultyException;
import com.epam.automation.javaerrorexceptions.exceptions.EmptyGroupException;
import com.epam.automation.javaerrorexceptions.exceptions.EmptyUniversityException;
import com.epam.automation.javaerrorexceptions.exceptions.NegativeGradeException;
import com.epam.automation.javaerrorexceptions.exceptions.NoCourseException;
import com.epam.automation.javaerrorexceptions.models.Faculty;
import com.epam.automation.javaerrorexceptions.models.Group;
import com.epam.automation.javaerrorexceptions.models.Student;
import com.epam.automation.javaerrorexceptions.models.University;
import com.epam.automation.javaerrorexceptions.models.enums.Courses;
import com.epam.automation.javaerrorexceptions.service.AverageGradeCalculator;

import java.util.HashMap;

import static com.epam.automation.javaerrorexceptions.models.enums.Courses.ARCHITECHTURE;
import static com.epam.automation.javaerrorexceptions.models.enums.Courses.ENGLISH;
import static com.epam.automation.javaerrorexceptions.models.enums.Courses.MATHEMATICS;

/**
 * Java. Error & Exceptions
 * Main task
 * <p>
 * В университете есть несколько факультетов, в которых учатся студенты, объединенные в группы. У каждого студента есть несколько учебных предметов по которым он получает оценки. Необходимо реализовать иерархию студентов, групп и факультетов.
 * <p>
 * Посчитать средний балл по всем предметам студента
 * Посчитать средний балл по конкретному предмету в конкретной группе и на конкретном факультете
 * Посчитать средний балл по предмету для всего университета
 * <p>
 * Релизовать следующие исключения:
 * <p>
 * Оценка ниже 0 или выше 10
 * Отсутствие предметов у студента (должен быть хотя бы один)
 * Отсутствие студентов в группе
 * Отсутствие групп на факультете
 * Отсутствие факультетов в университете
 *
 * @author Roman Kalinkin
 * @version 1.0
 */
public class MainTaskRunner {

    public static void main(String[] args) {
        try {
            HashMap<Courses, Integer> perfomance1 = new HashMap<>();
            perfomance1.put(MATHEMATICS, 10);
            perfomance1.put(ARCHITECHTURE, 8);
            perfomance1.put(ENGLISH, 6);
            Student student1 = new Student(perfomance1);

            HashMap<Courses, Integer> perfomance2 = new HashMap<>();
            perfomance2.put(MATHEMATICS, 6);
            perfomance2.put(ARCHITECHTURE, 6);
            perfomance2.put(ENGLISH, 4);
            Student student2 = new Student(perfomance2);

            HashMap<Courses, Integer> perfomance3 = new HashMap<>();
            perfomance3.put(MATHEMATICS, 8);
            perfomance3.put(ARCHITECHTURE, 8);
            Student student3 = new Student(perfomance3);

            HashMap<Courses, Integer> perfomance4 = new HashMap<>();
            perfomance4.put(ENGLISH, 8);
            Student student4 = new Student(perfomance4);

            Group group1 = new Group("Group_01");
            group1.addStudents(student1, student2);
            Group group2 = new Group("Group_02");
            group2.addStudents(student3, student4);

            Faculty faculty1 = new Faculty("Faculty_01");
            faculty1.addGroups(group1, group2);

            University university = new University();
            university.addFaculties(faculty1);

            AverageGradeCalculator averageGradeCalculator = new AverageGradeCalculator();
            averageGradeCalculator.calculateStudentAverageGrade(student1);
            averageGradeCalculator.calculateCourseAverageGradeOfGivenGroup(ENGLISH, group1);
            averageGradeCalculator.calculateCourseAverageGrade(ENGLISH, university);
        } catch (NegativeGradeException | NoCourseException | EmptyGroupException | EmptyFacultyException | EmptyUniversityException exception) {
            exception.printStackTrace();
        }
    }
}
