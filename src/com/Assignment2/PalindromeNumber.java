package com.Assignment2;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int original = in.nextInt();
        int number = original;
        int reversed = 0;

        while (number > 0) {
            int digit = number % 10;         // Get last digit
            reversed = reversed * 10 + digit; // Append digit
            number = number / 10;            // Remove last digit
        }

        if (original == reversed) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is NOT a palindrome.");
        }
    }
}
