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
        System.out.println(student1.getExamScores());
        System.out.println(student1.toString());
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
    @Test
    public void getStudentAverageExamScoreTest() {
        //Given
        Double[] kellysExams = {100.0, 95.0, 123.0, 96.0};
        Student kelly = new Student("Leon", "Hunter", kellysExams);

        //When
        double expectedAverage = 103.5;
        double actualAverage = kelly.getStudentAverageExamScore();

        //Then
        Assert.assertTrue(expectedAverage == actualAverage);
    }

    @Test
    public void getAverageExamScoreTest() {
        //Given
        Double[] s1Scores = { 120.0, 100.0, 95.0};
        Double[] s2Scores = { 100.0, 55.0, 85.0 };

        Student s1 = new Student("student", "one", s1Scores);
        Student s2 = new Student("student", "two", s2Scores);

        Student[] students = {s1,s2};
        Classroom classroom = new Classroom(students);

        // When
        System.out.println("ressult " + classroom.getStudents());

        double expectedAverage = 92.5;
        double actualAverage = classroom.getAverageExamScore();

         //Then

        Assert.assertTrue(expectedAverage == actualAverage);
    }
    @Test
    public void addStudentTest() {
        //Given
        Classroom tutorRoom = new Classroom(1);
        Double[] scores = { 75.0, 68.5, 87.5};

        Student tStudent = new Student("John","Smith", scores);
        tutorRoom.addStudent(tStudent);

        //When
        Student expectedStudent = tStudent;
        Student actualStudent = tutorRoom.getStudents()[0];

        //Then
        Assert.assertEquals(expectedStudent, actualStudent);

    }

    public void getNumberOfExamsTakenTest() {
    }
}