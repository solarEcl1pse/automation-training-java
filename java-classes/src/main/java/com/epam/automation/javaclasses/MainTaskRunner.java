package com.epam.automation.javaclasses;

import java.time.LocalDate;

import static com.epam.automation.javaclasses.enums.Course.COURSE_1;
import static com.epam.automation.javaclasses.enums.Course.COURSE_2;
import static com.epam.automation.javaclasses.enums.Faculty.ELECTRONICS;
import static com.epam.automation.javaclasses.enums.Faculty.MATHEMATICS;
import static com.epam.automation.javaclasses.enums.Group.GROUP_E11;
import static com.epam.automation.javaclasses.enums.Group.GROUP_E12;
import static com.epam.automation.javaclasses.enums.Group.GROUP_E21;
import static com.epam.automation.javaclasses.enums.Group.GROUP_E22;
import static com.epam.automation.javaclasses.enums.Group.GROUP_M11;
import static com.epam.automation.javaclasses.enums.Group.GROUP_M12;
import static com.epam.automation.javaclasses.enums.Group.GROUP_M21;
import static com.epam.automation.javaclasses.enums.Group.GROUP_M22;

/**
 * Java. Classes
 * Main task
 *
 * @author Roman Kalinkin
 * @version 1.0
 */
public class MainTaskRunner {

    public static void main(String[] args) {
        Student student1 = new Student(1, "Leno", "Bernd", "Viktor",
                LocalDate.of(1992, 3, 4), "London", "1234501",
                ELECTRONICS, COURSE_1, GROUP_E11);
        Student student2 = new Student(2, "Bellerín", "Héctor", "Moruno",
                LocalDate.of(1995, 3, 19), "London", "1234502",
                ELECTRONICS, COURSE_1, GROUP_E11);
        Student student3 = new Student(3, "Tierney", "Kieran", "Michael",
                LocalDate.of(1997, 6, 5), "London", "1234503",
                ELECTRONICS, COURSE_1, GROUP_E12);
        Student student4 = new Student(4, "Saliba", "William", "Brian",
                LocalDate.of(2001, 3, 24), "London", "1234504",
                ELECTRONICS, COURSE_1, GROUP_E12);
        Student student5 = new Student(5, "Torreira", "Lucas", "Ricardo",
                LocalDate.of(1996, 2, 11), "London", "1234505",
                ELECTRONICS, COURSE_2, GROUP_E21);
        Student student6 = new Student(6, "Magalhães", "Gabriel", "Marcelo",
                LocalDate.of(1997, 12, 19), "London", "1234506",
                ELECTRONICS, COURSE_2, GROUP_E21);
        Student student7 = new Student(7, " Saka", "Bukayo", "Ayoyinka",
                LocalDate.of(2001, 9, 5), "London", "1234507",
                ELECTRONICS, COURSE_2, GROUP_E22);
        Student student8 = new Student(8, "Ceballos", "Daniel", "Antonio",
                LocalDate.of(1996, 8, 7), "London", "1234508",
                ELECTRONICS, COURSE_2, GROUP_E22);
        Student student9 = new Student(9, "Lacazette", "Alexandre", "Alfred",
                LocalDate.of(1991, 5, 28), "London", "1234509",
                MATHEMATICS, COURSE_1, GROUP_M11);
        Student student10 = new Student(10, "Smith Rowe", "Emile", "Leslie",
                LocalDate.of(2000, 7, 28), "London", "1234510",
                MATHEMATICS, COURSE_1, GROUP_M11);
        Student student11 = new Student(11, "Ødegaard", "Martin", "Hans Erik",
                LocalDate.of(1998, 12, 17), "London", "1234511",
                MATHEMATICS, COURSE_1, GROUP_M12);
        Student student12 = new Student(12, "da Silva", "Willian", "Severino",
                LocalDate.of(1988, 8, 9), "London", "1234512",
                MATHEMATICS, COURSE_1, GROUP_M12);
        Student student13 = new Student(13, "Rúnarsson", "Rúnar Alex", "Rúnar",
                LocalDate.of(1996, 2, 18), "London", "1234513",
                MATHEMATICS, COURSE_2, GROUP_M21);
        Student student14 = new Student(14, "Aubameyang", "Pierre-Emerick", "Pierre-François",
                LocalDate.of(1989, 6, 18), "London", "1234514",
                MATHEMATICS, COURSE_2, GROUP_M21);
        Student student15 = new Student(15, " Maitland-Niles", "Ainsley", "Cory",
                LocalDate.of(1997, 8, 29), "London", "1234515",
                MATHEMATICS, COURSE_2, GROUP_M22);
        Student student16 = new Student(16, "Holding", "Rob", "Samuel",
                LocalDate.of(1995, 9, 20), "London", "1234516",
                MATHEMATICS, COURSE_2, GROUP_M22);
        StudentsHolder studentsHolder = new StudentsHolder(student1, student2, student3, student4, student5, student6,
                student7, student8, student9, student10, student11, student12, student13, student14, student15, student16);
        studentsHolder.getStudentsOfAGivenFaculty(ELECTRONICS);
        studentsHolder.getStudentsForEachFacultyAndCourse();
        studentsHolder.getStudentsBornAfterAGivenYear(2000);
        studentsHolder.getStudentsOfAGivenGroup(GROUP_E11);
    }
}
