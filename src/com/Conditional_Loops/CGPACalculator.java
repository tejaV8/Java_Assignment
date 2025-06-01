package com.Conditional_Loops;

import java.util.Scanner;

public class CGPACalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int n = in.nextInt();

        double sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter grade point for subject " + i + " (out of 10): ");
            double gradePoint = in.nextDouble();
            sum += gradePoint;
        }

        double cgpa = sum / n;

        System.out.printf("Your CGPA is: %.2f\n", cgpa);
    }
}
