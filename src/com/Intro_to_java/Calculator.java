package com.Intro_to_java;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = input.next().charAt(0);

        System.out.printf("Enter two numbers: ");
        double num1 = input.nextInt();
        double num2 = input.nextInt();

        double result = 0;

        // Using if conditions to perform operations
        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Error: Division by zero is not allowed.");
                input.close();
                return;
            }
        } else {
            System.out.println("Invalid operator.");
            input.close();
            return;
        }

        // Display result
        System.out.println("Result: " + result);

        input.close();
    }
}
