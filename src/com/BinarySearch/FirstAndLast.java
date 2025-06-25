package com.BinarySearch;
//Leetcode-34

import java.util.Arrays;

public class FirstAndLast {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};  // Input array (must be sorted)
        System.out.println(Arrays.toString(searchRange(arr, 7)));  // Find the first and last position of 7
    }

    // This function returns the first and last position of the target value
    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};  // Initialize answer with [-1, -1] (default when target not found)

        // Search for the first occurrence (leftmost index)
        ans[0] = search(nums, target, true);

        // If the first occurrence is found, search for the last occurrence (rightmost index)
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }

        return ans;  // Return the final range
    }

    // Helper function to perform binary search
    // If findStartIndex is true, find first occurrence; else find last occurrence
    public static int search(int arr[], int target, boolean findStartIndex) {
        int ans = -1;  // Default index if not found
        int start = 0;
        int end = arr.length - 1;

        // Standard binary search loop
        while (start <= end) {
            int mid = start + (end - start) / 2;  // Avoids integer overflow

            if (target < arr[mid]) {
                end = mid - 1;  // Move to left half
            } else if (target > arr[mid]) {
                start = mid + 1;  // Move to right half
            } else {
                ans = mid;  // Potential answer found

                // If looking for the first occurrence, continue searching left side
                if (findStartIndex) {
                    end = mid - 1;
                }
                // If looking for the last occurrence, continue searching right side
                else {
                    start = mid + 1;
                }
            }
        }

        return ans;  // Return found index (or -1 if not found)
    }
}
