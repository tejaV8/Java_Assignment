package com.Conditional_Loops;

import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter how many numbers (N): ");
        int n = in.nextInt();

        double sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            double num = in.nextDouble();
            sum += num;
        }

        double average = sum / n;
        System.out.printf("Average of %d numbers = %.2f\n", n, average);
    }
}
