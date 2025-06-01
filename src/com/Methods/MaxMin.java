package com.Methods;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three number: ");

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        input.close();

        int max = maximumOf(num1, num2, num3);

        System.out.println("Maximum number is: " + max);

        int min = minimumOf(num1, num2, num3);

        System.out.println("Minimum number is: " + min);
    }
    static int maximumOf(int a,int b,int c){
        int result = a;

        if(b>result){
            result = b;
        }
        if(c>result){
            result = c;
        }
        return result;
    }
    static int minimumOf(int a, int b, int c){
        int result = a;

        if(b<result){
            result = b;
        }
        if(c<result){
            result = c;
        }
        return result;
    }
}