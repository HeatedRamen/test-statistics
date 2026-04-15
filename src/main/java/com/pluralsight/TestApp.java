package com.pluralsight;

import java.util.Arrays;

public class TestApp {
    public static void main(String[] args) {
        int[] testScores = new int[9];

        generateTestsScores(testScores);
        displayTestScores(testScores);
        Arrays.sort(testScores);
        displayTestScores(testScores);

        displayHigh(testScores);
        displayLow(testScores);
        displayAverage(testScores);
        displayMedian(testScores);
    }

    static void generateTestsScores(int[] testScores){

        for (int i = 0 ; i < testScores.length ; i++) {
            testScores[i] = (int)(Math.random() * 100) + 1;
        }
    }
    static void displayTestScores (int[] testScores){
        for (int score : testScores){
            System.out.printf("%d\t",score);
        }
        System.out.println();
    }
    static void displayHigh(int[] testScores){
        System.out.printf("Highest Score: %d\n", testScores[(testScores.length - 1)]);
    }
    static void displayLow(int[] testScores){
        System.out.printf("Lowest Score: %d\n",testScores[0]);
    }
    static void displayAverage(int[] testScores){
        float sum = 0;
        for (int score : testScores){
            sum += score;
        }
        sum /= testScores.length;
        System.out.printf("Average Score: %.2f\n", sum);
    }

    static void displayMedian(int[] testScores){
        float median = 0f;

        if (testScores.length % 2 == 0) {
            median += testScores[(testScores.length / 2)];
            median += testScores[(testScores.length / 2) - 1];
            median /= 2f;
            System.out.printf("Median Score: %.2f\n", median);
        }
        else {
            median = testScores[testScores.length / 2];
            System.out.printf("Median Score: %.2f\n", median);
        }
    }
}
