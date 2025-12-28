package com.BitWise;

import java.util.Scanner;

public class ithBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enetr a numebr: ");
        int n = sc.nextInt();

        System.out.print("Enter position: ");
        int pos = sc.nextInt();

        System.out.println(pos + "th bit of number in binary form is: " + bit(n, pos));
    }

    public static int bit(int n, int pos) {
        return (n & (1 << (pos - 1))) != 0 ? 1 : 0;
    }
}