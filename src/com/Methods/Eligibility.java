package com.Methods;

import java.util.Scanner;

public class Eligibility {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = in.nextInt();

        in.close();
        checkEligibility(age);
    }
    static void checkEligibility(int num){
        if(num>0 && num<18){
            System.out.println("He/She is not eligible to vote.");
        }
        else if(num >= 18){
            System.out.println("He/She is eligible to vote.");
        }
        else {
            System.out.println("Invalid age entered.");
        }

    }
}
