package com.Conditional_Loops;


import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of units consumed: ");
        int units = in.nextInt();
        double bill = 0;

        if (units <= 100) {
            bill = units * 1.50;
        } else if (units <= 200) {
            bill = 100 * 1.50 + (units - 100) * 2.00;
        } else if (units <= 300) {
            bill = 100 * 1.50 + 100 * 2.00 + (units - 200) * 3.00;
        } else {
            bill = 100 * 1.50 + 100 * 2.00 + 100 * 3.00 + (units - 300) * 5.00;
        }

        System.out.printf("Total Electricity Bill for %d units = ₹%.2f\n", units, bill);
    }
}
