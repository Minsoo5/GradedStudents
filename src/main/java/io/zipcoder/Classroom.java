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

    public Classroom(Student[] students) {
        this.students = students;
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


    public double getAverageExamScore() {
        double averageScore = 0.0;
        double sumOfScore = 0.0;
        int numOfStudents = 0;

        for (Student stu : this.getStudents()) {
            sumOfScore += stu.getStudentAverageExamScore();
            numOfStudents++;
        }
        averageScore = sumOfScore / numOfStudents;

        //120, 100, 95 -- 105
        //100, 55, 85 -- 80
        //92.5
        return averageScore;
    }


    public void addStudent(Student student) {

    }



}
