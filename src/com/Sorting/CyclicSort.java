package com.Sorting;

import java.util.Arrays;

import static java.util.Collections.swap;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 1, 4};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int corrected = arr[i] - 1;
            if (arr[i] != arr[corrected]) {
                swap(arr, i, corrected);
            } else {
                i++;
            }
        }
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}
