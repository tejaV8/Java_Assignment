package com.Conditional_Loops;

import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter principal amount: ₹");
        double principal = in.nextDouble();

        System.out.print("Enter annual interest rate (in %): ");
        double rate = in.nextDouble();

        System.out.print("Enter time (in years): ");
        double time = in.nextDouble();

        System.out.print("Enter number of times interest applied per year: ");
        int n = in.nextInt();

        double amount = principal * Math.pow(1 + (rate / 100) / n, n * time);
        double compoundInterest = amount - principal;

        System.out.printf("Compound Interest = ₹%.2f\n", compoundInterest);
        System.out.printf("Total Amount = ₹%.2f\n", amount);
    }
}
