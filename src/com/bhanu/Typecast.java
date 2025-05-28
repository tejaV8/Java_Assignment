package com.bhanu;

import java.util.Scanner;

public class Typecast {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
     //   float f = input.nextFloat();
    //    int i = input.nextFloat();  // This will throw an error a float cannot be read into int

        //Typecasting

        int i = (int)(123.45); // Here floating variable is converted into integer
        System.out.print(i);
    }
}
