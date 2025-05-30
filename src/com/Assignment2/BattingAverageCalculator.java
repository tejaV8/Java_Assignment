package com.Assignment2;

import java.util.Scanner;

public class BattingAverageCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter total runs scored: ");
        int totalRuns = in.nextInt();

        System.out.print("Enter number of times the player got out: ");
        int outs = in.nextInt();

        if (outs == 0) {
            System.out.println("Batting average is undefined (player was never out).");
        } else {
            double average = (double) totalRuns / outs;
            System.out.printf("Batting Average: %.2f\n", average);
        }
    }
}
