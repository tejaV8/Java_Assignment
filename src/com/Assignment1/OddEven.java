package com.Assignment1;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a number: ");

        int num = input.nextInt();

        if(num < 1){
            System.out.printf(num + " is neither even nor odd");
        }
        else if(num%2 == 0){
            System.out.printf(num + " is even.");
        }
        else{
            System.out.printf(num + " is odd.");
        }
    }
}
