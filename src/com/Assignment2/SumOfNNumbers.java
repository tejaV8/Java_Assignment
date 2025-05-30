package com.Assignment2;

import java.util.Scanner;

public class SumOfNNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter how many numbers (N): ");
        int n = in.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = in.nextInt();
            sum += num;
        }

        System.out.println("Sum of " + n + " numbers is: " + sum);
    }
}
