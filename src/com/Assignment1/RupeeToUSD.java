package com.Assignment1;

import java.util.Scanner;

public class RupeeToUSD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter the amount in Rupees: ");
        double rupees = input.nextDouble();

        double conversionRate = 85.40;

        double usd = rupees / conversionRate;

        System.out.printf("Equivalent amount in USD: $%.2f", usd);
    }
}
