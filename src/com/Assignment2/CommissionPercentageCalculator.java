package com.Assignment2;

import java.util.Scanner;

public class CommissionPercentageCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter total sales amount: ₹");
        double sales = in.nextDouble();

        System.out.print("Enter commission earned: ₹");
        double commission = in.nextDouble();

        if (sales <= 0) {
            System.out.println("Sales amount must be greater than zero.");
        } else {
            double commissionPercent = (commission / sales) * 100;
            System.out.printf("Commission Percentage: %.2f%%\n", commissionPercent);
        }
    }
}
