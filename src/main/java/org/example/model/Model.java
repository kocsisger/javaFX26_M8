package org.example.model;

import java.time.LocalDate;
import java.time.Month;

public class Model {

    private Student student;

    public Model() {
        student = new Student("Robert Smith", 32, LocalDate.of(2006, Month.SEPTEMBER,28));
    }

    public Student getStudent() {
        return student;
    }
}
