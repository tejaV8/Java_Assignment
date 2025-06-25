package com.BinarySearch;

// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/

public class InfiniteArray {
    public static void main(String[] args) {
        // Example input array (assumed to be infinite or large)
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;  // Element to search

        // Call the search function and print result
        System.out.println(ans(arr, target));
    }

    // Function to find position of target in an "infinite" array
    static int ans(int[] arr, int target) {
        int start = 0;
        int end = 1;

        // First, find a range where target can lie
        // Keep expanding the search window until arr[end] >= target
        while (target > arr[end]) {
            int temp = end + 1;  // Store the new start index
            // Double the window size: (end - start + 1) * 2
            end = end + (end - start + 1) * 2;
            start = temp;  // Update start to previous end + 1
        }

        // Now perform binary search within the found range
        return binarySearch(arr, target, start, end);
    }

    // Standard binary search implementation between given start and end
    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;  // Move to the left half
            } else if (target > arr[mid]) {
                start = mid + 1;  // Move to the right half
            } else {
                return mid;  // Element found
            }
        }
        return -1;  // Element not found
    }
}
