package io.zipcoder;

import java.util.ArrayList;

public class Classroom {

    private Student[] students;


    public Classroom() {
        this.students = new Student[30];
    }

    public Classroom(int maxNumberOfStudents) {
        this.students = new Student[maxNumberOfStudents];
    }

    public Classroom(int maxNumberOfStudents, Student[] students) {
        this.students = new Student[maxNumberOfStudents];
        for (Student s : students) {
            int index = 0;
            this.students[index] = s;
        }
    }

    public Student[] getStudents() {
        return this.students;
    }



}
