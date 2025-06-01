package com.Methods;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = in.nextInt();


        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }

        in.close();
    }
    static boolean isPrime(int value){
        if(value <= 0){
            return false;
        }
        else{
            int i=2;
            while(i*i<=value){
                if(value%i == 0){
                    return false;

                }
                i++;
            }
        }
        return true;
    }
}
