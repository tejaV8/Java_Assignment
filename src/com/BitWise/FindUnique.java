package com.BitWise;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 1, 2, 1, 3, 6, 4};

        System.out.print("Unique Element is: " + unique(arr));
    }

    public static int unique(int[] arr) {
        int ans = 0;
        for (int n : arr) {
            ans ^= n;
        }
        return ans;
    }
}
