package com.epam.automation.javaerrorexceptions.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class University {

    private final List<Faculty> faculties = new ArrayList<>();

    public University() {
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }

    public void addFaculties(Faculty... faculties) {
        this.faculties.addAll(Arrays.asList(faculties));
    }

    @Override
    public String toString() {
        return "University";
    }
}
