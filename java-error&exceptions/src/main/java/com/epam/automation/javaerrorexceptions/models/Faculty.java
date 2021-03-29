package com.epam.automation.javaerrorexceptions.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Faculty {

    private final List<Group> groups = new ArrayList<>();
    private String facultyName;

    public Faculty(String facultyName) {
        this.facultyName = facultyName;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void addGroups(Group... group) {
        this.groups.addAll(Arrays.asList(group));
    }

    @Override
    public String toString() {
        return facultyName;
    }
}
