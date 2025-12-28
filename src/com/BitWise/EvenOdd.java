package com.BitWise;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        if (!evenOdd(n)) {
            System.out.println(n + " is Even number");
        } else {
            System.out.println(n + " is Odd number");
        }

    }

    public static boolean evenOdd(int n) {
        return (n & 1) == 1;
    }
}
