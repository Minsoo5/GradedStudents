package io.zipcoder;
import java.util.ArrayList;

public class Student {

    private String firstName;

    private String lastName;

    private ArrayList<Double[]> examScores;


    public Student(String firstName, String lastName, Double[] testScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores.add(testScores);
    }



    public String getFirstname() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ArrayList<Double[]> getExamScores() {
        return examScores;
    }

    public void setExamScores(Double[] testScores) {
        this.examScores.add(testScores);
    }

}
