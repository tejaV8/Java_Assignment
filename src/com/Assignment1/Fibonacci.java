package com.Assignment1;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = 0, num2 = 1;
        int num3;

        System.out.printf("Enter the number of terms: ");
        int terms = input.nextInt();

        System.out.printf("Fibonacci series: ");

        for(int i=0;i<terms;i++){
            System.out.printf(num1 + " ");

            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
        input.close();
    }
}
