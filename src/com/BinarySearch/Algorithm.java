package com.BinarySearch;

import java.util.Scanner;

public class Algorithm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        System.out.print("Enter target element: ");
        int target = in.nextInt();
        in.close();

        int ans = binarySearch(arr, target);

        System.out.println(ans);
    }

    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
