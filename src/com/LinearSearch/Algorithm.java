package com.LinearSearch;

import java.util.Scanner;

public class Algorithm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter target element: ");
        int[] arr = {1, 2, 4, 5, 6, 99, 33, 3, 101};

        int target = input.nextInt();
        int ans = searchIn(arr, arr.length, target);
        System.out.println(ans);
    }

    public static int searchIn(int[] nums, int n, int target) {
        for (int i = 0; i < n; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
