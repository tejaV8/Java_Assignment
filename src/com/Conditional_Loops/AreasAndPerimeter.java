/*
  This is all in one Calculator
 */


package com.Conditional_Loops;

import java.util.Scanner;

public class AreasAndPerimeter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Area of Circle");
            System.out.println("2. Area of Triangle");
            System.out.println("3. Area of Rectangle");
            System.out.println("4. Area of Isosceles Triangle");
            System.out.println("5. Area of Parallelogram");
            System.out.println("6. Area of Rhombus");
            System.out.println("7. Area of Equilateral Triangle");
            System.out.println("8. Perimeter of Circle");
            System.out.println("9. Perimeter of Equilateral Triangle");
            System.out.println("10. Perimeter of Parallelogram");
            System.out.println("11. Perimeter of Rectangle");
            System.out.println("12. Perimeter of Square");
            System.out.println("13. Perimeter of Rhombus");
            System.out.println("14. Volume of Cone");
            System.out.println("15. Volume of Prism");
            System.out.println("16. Volume of Cylinder");
            System.out.println("17. Volume of Sphere");
            System.out.println("18. Volume of Pyramid");
            System.out.println("19. Curved Surface Area of Cylinder");
            System.out.println("20. Total Surface Area of Cube");
            System.out.println("21. Fibonacci Series");
            System.out.println("22. Subtract Product and Sum of Digits");
            System.out.println("23. Factors of a Number");
            System.out.println("24. Sum Until 0");
            System.out.println("25. Max Until 0");
            System.out.println("26. Addition of Two Numbers");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            int choice = in.nextInt();
            if (choice == 0) break;

            switch (choice) {
                case 1 -> {
                    double r = in.nextDouble();
                    System.out.println("Area: " + Math.PI * r * r);
                }
                case 2, 4 -> {
                    double b = in.nextDouble(), h = in.nextDouble();
                    System.out.println("Area: " + 0.5 * b * h);
                }
                case 3 -> {
                    double l = in.nextDouble(), w = in.nextDouble();
                    System.out.println("Area: " + l * w);
                }
                case 5 -> {
                    double b = in.nextDouble(), h = in.nextDouble();
                    System.out.println("Area: " + b * h);
                }
                case 6 -> {
                    double d1 = in.nextDouble(), d2 = in.nextDouble();
                    System.out.println("Area: " + 0.5 * d1 * d2);
                }
                case 7 -> {
                    double side = in.nextDouble();
                    System.out.println("Area: " + (Math.sqrt(3) / 4) * side * side);
                }
                case 8 -> {
                    double r = in.nextDouble();
                    System.out.println("Perimeter: " + 2 * Math.PI * r);
                }
                case 9 -> {
                    double side = in.nextDouble();
                    System.out.println("Perimeter: " + 3 * side);
                }
                case 10 -> {
                    double a = in.nextDouble(), b = in.nextDouble();
                    System.out.println("Perimeter: " + 2 * (a + b));
                }
                case 11 -> {
                    double l = in.nextDouble(), w = in.nextDouble();
                    System.out.println("Perimeter: " + 2 * (l + w));
                }
                case 12, 13 -> {
                    double side = in.nextDouble();
                    System.out.println("Perimeter: " + 4 * side);
                }
                case 14 -> {
                    double r = in.nextDouble(), h = in.nextDouble();
                    System.out.println("Volume: " + (Math.PI * r * r * h) / 3);
                }
                case 15 -> {
                    double baseArea = in.nextDouble(), height = in.nextDouble();
                    System.out.println("Volume: " + baseArea * height);
                }
                case 16 -> {
                    double r = in.nextDouble(), h = in.nextDouble();
                    System.out.println("Volume: " + Math.PI * r * r * h);
                }
                case 17 -> {
                    double r = in.nextDouble();
                    System.out.println("Volume: " + (4.0 / 3.0) * Math.PI * r * r * r);
                }
                case 18 -> {
                    double baseArea = in.nextDouble(), height = in.nextDouble();
                    System.out.println("Volume: " + (baseArea * height) / 3);
                }
                case 19 -> {
                    double r = in.nextDouble(), h = in.nextDouble();
                    System.out.println("CSA: " + 2 * Math.PI * r * h);
                }
                case 20 -> {
                    double side = in.nextDouble();
                    System.out.println("TSA of Cube: " + 6 * side * side);
                }
                case 21 -> {
                    int n = in.nextInt(), a = 0, b = 1;
                    for (int i = 0; i < n; i++) {
                        System.out.print(a + " ");
                        int temp = a + b;
                        a = b;
                        b = temp;
                    }
                    System.out.println();
                }
                case 22 -> {
                    int n = in.nextInt(), sum = 0, prod = 1;
                    while (n > 0) {
                        int digit = n % 10;
                        sum += digit;
                        prod *= digit;
                        n /= 10;
                    }
                    System.out.println("Result: " + (prod - sum));
                }
                case 23 -> {
                    int n = in.nextInt();
                    for (int i = 1; i <= n; i++) {
                        if (n % i == 0) System.out.print(i + " ");
                    }
                    System.out.println();
                }
                case 24 -> {
                    int sum = 0, num;
                    do {
                        num = in.nextInt();
                        sum += num;
                    } while (num != 0);
                    System.out.println("Sum: " + sum);
                }
                case 25 -> {
                    int num, max = Integer.MIN_VALUE;
                    do {
                        num = in.nextInt();
                        if (num != 0 && num > max) max = num;
                    } while (num != 0);
                    System.out.println("Max: " + max);
                }
                case 26 -> {
                    int a = in.nextInt(), b = in.nextInt();
                    System.out.println("Sum: " + (a + b));
                }
                default -> System.out.println("Invalid choice.");
            }
        }
        in.close();
        System.out.println("Program ended.");
    }
}
