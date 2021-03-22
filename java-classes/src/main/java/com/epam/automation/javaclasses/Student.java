package com.epam.automation.javaclasses;

import com.epam.automation.javaclasses.enums.Course;
import com.epam.automation.javaclasses.enums.Faculty;
import com.epam.automation.javaclasses.enums.Group;

import java.time.LocalDate;

/**
 * 1. Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон, Факультет, Курс, Группа.
 */
public class Student {

    private int id;
    private String surname;
    private String firstName;
    private String patronymic;
    private LocalDate birthdate;
    private String address;
    private String phoneNumber;
    private Faculty faculty;
    private Course course;
    private Group group;

    public Student() {
    }

    public Student(int id, String surname, String firstName, String patronymic, LocalDate birthdate, String address, String phoneNumber, Faculty faculty, Course course, Group group) {
        this.id = id;
        this.surname = surname;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.birthdate = birthdate;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student {" +
                "id = " + id +
                ", surname = '" + surname + '\'' +
                ", first name = '" + firstName + '\'' +
                ", patronymic = '" + patronymic + '\'' +
                ", birthdate = " + birthdate +
                ", address = '" + address + '\'' +
                ", phone number = '" + phoneNumber + '\'' +
                ", faculty = " + faculty +
                ", course = " + course +
                ", group = " + group +
                '}';
    }
}
