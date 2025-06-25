package com.BinarySearch;

//Leetcode-410
public class SplitArray {
    public static void main(String[] args) {
        int[] arr = {7, 2, 5, 10, 8};
        System.out.println(splitArray(arr, 2));  // Output: 18
    }

    public static int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;

        // Initialize search range
        // - start = max element (smallest possible max subarray sum)
        // - end = total sum (largest possible max subarray sum)
        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);  // largest single element
            end += nums[i];  // total sum of the array
        }

        // Binary search for the minimum possible largest subarray sum
        while (start < end) {
            int mid = start + (end - start) / 2;  // candidate max subarray sum

            int sum = 0;
            int pieces = 1;  // we always have at least one subarray

            // Count how many subarrays we need if max allowed sum is `mid`
            for (int num : nums) {
                if (sum + num > mid) {
                    // If adding num exceeds mid, create a new subarray
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }

            if (pieces > m) {
                // Too many pieces → mid is too small → search higher
                start = mid + 1;
            } else {
                // Valid split → try a smaller maximum
                end = mid;
            }
        }

        // At the end, start == end → the minimum possible max subarray sum
        return end;
    }
}
