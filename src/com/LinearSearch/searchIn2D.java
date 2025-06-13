package com.LinearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class searchIn2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        int rows = arr.length;
        int cols = arr[0].length;
        System.out.println("Enter target element: ");
        int target = in.nextInt();
        int[] ans = searchIn2D(arr, rows, cols, target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] searchIn2D(int[][] nums, int r, int c, int target) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (nums[i][j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}