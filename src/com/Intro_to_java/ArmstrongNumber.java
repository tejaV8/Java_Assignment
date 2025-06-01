package com.Intro_to_java;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter lower bound: ");
        int lower = input.nextInt();

        System.out.print("Enter upper bound: ");
        int upper = input.nextInt();

        System.out.println("Armstrong numbers between " + lower + " and " + upper + " are:");

        for (int num = lower; num <= upper; num++) {
            int originalNum = num;
            int sum = 0;


            int digits = String.valueOf(num).length();

            int temp = num;
            while (temp > 0) {
                int digit = temp % 10;
                sum += (int) Math.pow(digit, digits);
                temp /= 10;
            }

            if (sum == originalNum) {
                System.out.print(originalNum + " ");
            }
        }

        input.close();
    }
}
