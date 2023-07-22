package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StudentTest {

    public void getFirstnameTest() {
    }

    public void setFirstNameTest() {
    }

    public void getLastNameTest() {
    }

    public void setLastNameTest() {
    }

    @Test
    public void getExamScoresTest() {
        //Given
        Scanner sc = new Scanner(System.in);
        Double[] student1Exams = {100.0, 95.0, 123.0, 96.0};
        Student student1 = new Student("Leon", "Hunter", student1Exams);

        //When
        student1.getExamScores();
        String expectedConsole = "Exam 1 -> 100\nExam 1 -> 95\nExam 1 -> 123\nExam 1 -> 96\n";


        //Then
        //Somehow compare thow two in console.

    }

    @Test
    public void addExamScoreTest() {
        //Given
        Double[] johnsExams = {97.0};
        Student John = new Student("John", "Smith", johnsExams);

        //When
        John.addExamScores(90.0);
        ArrayList<Double> expectedArray = new ArrayList<Double>(Arrays.asList(97.0, 90.0));
        ArrayList<Double> actualArray = John.getterExamScore();

        //Then
        Assert.assertEquals(expectedArray, actualArray);


    }

    @Test
    public void setExamScoreTest() {
        //Given
        Double[] gregsExams = {100.0, 95.0, 123.0, 96.0};
        Student greg = new Student("Leon", "Hunter", gregsExams);

        //When
        greg.setExamScore(2, 110.0);
        ArrayList<Double> expectedgregArray = new ArrayList<Double>(Arrays.asList(100.0, 110.0, 123.0, 96.0));
        ArrayList<Double> actualgregArray = greg.getterExamScore();

        //Then
        Assert.assertEquals(expectedgregArray, actualgregArray);

    }

    public void getAverageExamScoreTest() {
        //Given

        //When

        //Then

    }

    public void getNumberOfExamsTakenTest() {
    }
}