package com.Assignment2;

import java.util.Scanner;

public class AverageMarksCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int n = in.nextInt();

        double sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            double marks = in.nextDouble();
            sum += marks;
        }

        double average = sum / n;

        System.out.printf("Average marks = %.2f\n", average);
    }
}
