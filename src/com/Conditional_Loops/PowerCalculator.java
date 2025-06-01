package com.Conditional_Loops;

import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the base: ");
        double base = in.nextDouble();

        System.out.print("Enter the exponent: ");
        double exponent = in.nextDouble();

        double result = Math.pow(base, exponent);

        System.out.printf("%.2f raised to the power %.2f is %.4f\n", base, exponent, result);
    }
}
