package com.BinarySearch;

public class findInMountainArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 3, 2, 1};  // Mountain array
        int target = 3;

        // Call the search function to find the target
        System.out.println(search(arr, target));  // Output: 4
    }

    // Binary search that works for both ascending and descending sorted arrays
    static int orderAgnosticBS(int[] arr, int target, int start, int end) {
        // Determine if the sub-array is ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;  // Found the target
            }

            if (isAsc) {
                // Ascending order logic
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                // Descending order logic
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;  // Not found
    }

    // Main function to find target in a mountain array
    static int search(int[] arr, int target) {
        // First find the peak index
        int peak = peakIndexInMountainArray(arr);

        // Search in the ascending part of the array
        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;  // Found in left part
        }

        // If not found, search in the descending part
        return orderAgnosticBS(arr, target, peak + 1, arr.length - 1);
    }

    // Find the peak (maximum) element index in the mountain array
    static public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        // Use binary search to find the peak
        while (start < end) {
            int mid = start + (end - start) / 2;

            // If mid element is greater than the next, you are in the decreasing part
            if (arr[mid] > arr[mid + 1]) {
                end = mid;  // Possible peak
            } else {
                start = mid + 1;  // Move to increasing part
            }
        }

        // Start and end point to the peak element
        return start;
    }
}
