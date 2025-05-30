package com.Assignment2;

import java.util.Scanner;

public class DistanceCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter x1: ");
        double x1 = in.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = in.nextDouble();

        System.out.print("Enter x2: ");
        double x2 = in.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = in.nextDouble();

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.printf("Distance between (%.2f, %.2f) and (%.2f, %.2f) is %.2f\n",
                x1, y1, x2, y2, distance);
    }
}
