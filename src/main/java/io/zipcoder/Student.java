package io.zipcoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {

    private String firstName;

    private String lastName;

    private ArrayList<Double> examScores;


    public Student(String firstName, String lastName, Double[] testScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<Double>(Arrays.asList(testScores));
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

    public String getExamScores() {
        StringBuilder examScoreChart = new StringBuilder();
        for (Double e : this.examScores) {
            int examNum = 1;
            examScoreChart.append("Exam " + examNum + " -> " + e + "\n");
            examNum++;
        }
        return examScoreChart.toString();
    }

    public double getStudentAverageExamScore() {
        double total = 0;
        for (Double s : this.examScores) {
            total+= s;
        }
        return total/this.examScores.size();
    }

    public void addExamScores(Double examScore) {this.examScores.add(examScore);}


    public void setExamScore(int examNumber, double newScore) {
        this.examScores.set(examNumber -1 , newScore);

    }

    public String toString() {
        StringBuilder studentInfo = new StringBuilder();
        studentInfo.append("Student Name : " + this.getFirstname() + " " + this.getLastName() + "\n");
        studentInfo.append("Average Score: " + this.getStudentAverageExamScore() + "\n");
        studentInfo.append("Exam Scores:\n" + this.getExamScores());

        return studentInfo.toString();
    }

    public Integer getNumberOfExamsTaken() {return this.examScores.size();}

    public ArrayList<Double> getterExamScore() {return this.examScores;}

    public void setterExamScores(Double testScores) {
        this.examScores = new ArrayList<Double>(Arrays.asList(testScores));
    }

}


