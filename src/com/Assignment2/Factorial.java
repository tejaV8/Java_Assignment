package com.Assignment2;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long fact = 1;
        System.out.printf("Enter a number to find its factorial: ");
        long num = Long.parseLong(in.nextLine());

        int i = 1;

        while(i <= num){

            fact = fact*i;

            i++;

        }
        System.out.printf("Factorial of " + num + " is " + fact);
    }
}
