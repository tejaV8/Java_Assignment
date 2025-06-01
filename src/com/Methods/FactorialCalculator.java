package com.Methods;

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number to find its factorial: ");
        long num = in.nextLong();

        System.out.println("The Factorial of " + num + " is " + factorial(num));
    }
    static long factorial(long n){
        if(n == 0|| n == 1){
            return 1;
        }
        else{
            return(n*factorial(n-1));
        }
    }
}
