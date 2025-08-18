package com.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {15, 5, 13, 1, 4, 18, 90, 21};
        selectionSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int last = n - i - 1;
            int maxIndex = getMax(arr, 0, last);

            if (maxIndex != last) {
                swap(arr, last, maxIndex);
                System.out.println("After pass " + (i + 1) + ": " + Arrays.toString(arr));
            }
        }
    }

    static int getMax(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
