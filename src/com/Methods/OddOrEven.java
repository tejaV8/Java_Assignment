package com.Methods;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = input.nextInt();

        oddOrEven(num);

        input.close();
    }

    static void oddOrEven(int number) {
        if (number <= 0) {
            System.out.println(number + " is neither Even nor Odd.");
        } else if (number % 2 == 0) {
            System.out.println(number + " is an Even number.");
        } else {
            System.out.println(number + " is an Odd number.");
        }
    }
}
