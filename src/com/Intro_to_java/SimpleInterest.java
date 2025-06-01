package com.Intro_to_java;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter principal amount: ");
        double principalAmount = input.nextDouble();

        System.out.printf("Enter time: ");
        double time = input.nextDouble();

        System.out.printf("Enter rate of interest: ");
        double rateOfInterest = input.nextDouble();

        double simpleInterest = (principalAmount * time * rateOfInterest)/100;

        System.out.printf("The simple interest is: " + simpleInterest);
    }
}
