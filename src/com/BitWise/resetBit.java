package com.BitWise;

public class resetBit {
    public static void main(String[] args) {
        int n = 21;
        int pos = 3;
        System.out.println(setBit(n, pos));
    }

    public static int setBit(int n, int pos) {
        return n & ~(1 << (pos - 1));
    }
}
