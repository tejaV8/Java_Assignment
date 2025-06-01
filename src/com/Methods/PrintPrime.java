package com.Methods;

import java.util.Scanner;

public class PrintPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("Enter from number: ");
        int from = in.nextInt();

        System.out.printf("Enter to number: ");
        int to = in.nextInt();

        in.close();

        System.out.printf("Prime numbers between " + from + " and " + to + ": ");
        printPrimes(from, to);
    }
    static void printPrimes(int start, int end){
        for (int num = start; num <= end; num++) {
            int count = 0;

            if (num <= 1) {
                continue;
            }

            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    count++;
                    break;
                }
            }

            if (count == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
}
