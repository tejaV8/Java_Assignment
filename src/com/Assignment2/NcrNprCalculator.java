package com.Assignment2;

import java.util.Scanner;

public class NcrNprCalculator {

    // Method to calculate factorial of a number
    public static long factorial(int num) {
        long fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter n (total items): ");
        int n = in.nextInt();

        System.out.print("Enter r (items to choose): ");
        int r = in.nextInt();

        if (r > n) {
            System.out.println("Invalid input: r cannot be greater than n.");
            return;
        }

        long nFact = factorial(n);
        long rFact = factorial(r);
        long nMinusRFact = factorial(n - r);

        long nCr = nFact / (rFact * nMinusRFact);
        long nPr = nFact / nMinusRFact;

        System.out.println("nCr (Combinations) = " + nCr);
        System.out.println("nPr (Permutations) = " + nPr);
    }
}
