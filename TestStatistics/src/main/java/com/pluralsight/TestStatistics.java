package com.pluralsight;

public class TestStatistics {
    public static void main(String[] args) {
        int[] arrayScores = {10,2,4,15,16,13,14,17,20,11};
        int sum = 0;
        int average = 0;
        int highScore = arrayScores[0];
        int lowestScore = arrayScores[0];
        int median = 0;
        for (int i = 0; i < arrayScores.length; i++){
            sum += arrayScores[i];
            average = sum / arrayScores.length;
            highScore = Math.max(highScore, arrayScores[i]);
            lowestScore = Math.min(lowestScore, arrayScores[i]);
            median = highScore + lowestScore /2;
        }
        System.out.println("This is Sum: " + sum);
        System.out.println("This is the Average: " + average);
        System.out.println("This is High Score: " + highScore);
        System.out.println("This is Lowest Score: " + lowestScore);
        System.out.println("This is Median: " + median);

    }
}
