package com.bhanu;

import java.util.Scanner;

public class sum{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.print("The sum of " + num1 + " and " + num2 + " is " + sum);
    }
}