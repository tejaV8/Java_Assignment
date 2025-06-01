package com.Conditional_Loops;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = in.nextInt();

        int sum = 0;
        int original = num;

        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num = num / 10;
        }

        System.out.println("Sum of digits of " + original + " is: " + sum);
    }
}
