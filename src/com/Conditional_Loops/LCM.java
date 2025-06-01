package com.Conditional_Loops;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = in.nextInt();

        System.out.print("Enter second number: ");
        int num2 = in.nextInt();

        int a = num1;
        int b = num2;

        // Find HCF using Euclidean algorithm
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        int hcf = a;

        // LCM formula
        int lcm = (num1 * num2) / hcf;

        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }
}
