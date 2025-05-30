package com.Assignment2;

import java.util.Scanner;

public class DepreciationCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the initial value of the asset: ₹");
        double initialCost = in.nextDouble();

        System.out.print("Enter the salvage value (residual value): ₹");
        double salvageValue = in.nextDouble();

        System.out.print("Enter the useful life of the asset (in years): ");
        int years = in.nextInt();

        double depreciation = (initialCost - salvageValue) / years;

        System.out.printf("Annual Depreciation: ₹%.2f\n", depreciation);

        System.out.print("Enter number of years passed: ");
        int usedYears = in.nextInt();

        double currentValue = initialCost - (depreciation * usedYears);
        if (currentValue < salvageValue) {
            currentValue = salvageValue;
        }

        System.out.printf("Current value of the asset after %d years: ₹%.2f\n", usedYears, currentValue);
    }
}
