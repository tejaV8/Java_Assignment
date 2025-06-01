package com.Methods;

import java.util.Scanner;

public class CircumArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        double area = calculateArea(radius);
        double circumference = calculateCircumference(radius);

        System.out.println("Area of the circle is: " + area);
        System.out.println("Circumference of the circle is: " + circumference);

        input.close();
    }

    static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    static double calculateCircumference(double radius) {
        return 2 * Math.PI * radius;
    }
}
