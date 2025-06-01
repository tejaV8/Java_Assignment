package com.Intro_to_java;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        // Convert to lowercase for case-insensitive check
        str = str.toLowerCase();

        // Reverse the string manually
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        // Check for palindrome
        if (str.equals(reversed)) {
            System.out.println("The string " + str + " is a palindrome.");
        } else {
            System.out.print("The string " + str + " is not a palindrome.");
        }

        input.close();
    }
}
