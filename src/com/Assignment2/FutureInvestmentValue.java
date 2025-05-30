package com.Assignment2;

import java.util.Scanner;

public class FutureInvestmentValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter investment amount (P): ₹");
        double principal = in.nextDouble();

        System.out.print("Enter annual interest rate (in %): ");
        double annualRate = in.nextDouble();
        double rate = annualRate / 100; // Convert to decimal

        System.out.print("Enter number of years: ");
        int years = in.nextInt();

        System.out.print("Enter number of times interest is compounded per year: ");
        int n = in.nextInt();

        double futureValue = principal * Math.pow(1 + (rate / n), n * years);

        System.out.printf("Future Investment Value after %d years: ₹%.2f\n", years, futureValue);
    }
}
