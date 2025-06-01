package com.Methods;

import java.util.Scanner;

public class SumOfTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        int result = sumOfTwo(num1, num2);

        System.out.println("The sum of " + num1 + " and " + num2 + " is " + result);
     }
    static int sumOfTwo(int a, int b){
        return (a+b);
    }
}
