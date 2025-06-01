package com.Methods;

import java.util.Scanner;

public class ProductOfTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        int result = productOfTwo(num1, num2);

        System.out.println("The product of " + num1 + " and " + num2 + " is " + result);
    }
    static int productOfTwo(int a, int b){
        return (a*b);
    }
}
