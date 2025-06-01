package com.Conditional_Loops;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a single alphabet character: ");
        char ch = in.next().trim().toLowerCase().charAt(0);

        if (!Character.isLetter(ch)) {
            System.out.println("Invalid input. Please enter an alphabet character.");
        } else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is a Vowel.");
        } else {
            System.out.println(ch + " is a Consonant.");
        }
    }
}
