package com.Conditional_Loops;

import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter original price of the product: ₹");
        double price = in.nextDouble();

        System.out.print("Enter discount percentage: ");
        double discountPercent = in.nextDouble();

        double discountAmount = (price * discountPercent) / 100;
        double finalPrice = price - discountAmount;

        System.out.printf("Discount Amount: ₹%.2f\n", discountAmount);
        System.out.printf("Price after Discount: ₹%.2f\n", finalPrice);
    }
}
