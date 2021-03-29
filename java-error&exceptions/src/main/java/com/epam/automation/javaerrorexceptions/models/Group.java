package com.epam.automation.javaerrorexceptions.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Group {

    private final List<Student> students = new ArrayList<>();
    private String groupName;

    public Group(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudents(Student... student) {
        this.students.addAll(Arrays.asList(student));
    }

    @Override
    public String toString() {
        return groupName;
    }
}
