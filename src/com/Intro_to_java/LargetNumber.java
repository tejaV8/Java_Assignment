package com.Intro_to_java;

import java.util.Scanner;

public class LargetNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter two numbers: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();

        if(num1 == num2){
            System.out.printf(num1 + " and " + num2 + " both are equal.");
        }
        else if(num1 > num2){
            System.out.printf(num1 + " is greater than " + num2 + ".");

        }
        else {
            System.out.printf(num2 + " is greater than " + num1 + ".");
        }
    }
}
