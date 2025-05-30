package com.bhanu;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.nextLine();

        System.out.print("Enter a number: ");
        int number = Integer.valueOf(input.nextLine());

        System.out.print("Enter a floating number: ");
        Double floatingNumber = Double.valueOf(input.nextLine());

        System.out.printf("Enter a true of false: ");
        Boolean value = Boolean.valueOf(input.nextLine());

        System.out.println("You gave the string " + text);
        System.out.println("You gave the integer " + number);
        System.out.println("You gave the double " + floatingNumber);
        System.out.println("You gave the boolean " + value);
    }
}