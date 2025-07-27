package com.Sorting;
//LeetCode: 645

import java.util.ArrayList;
import java.util.List;

class FindError {
    public int[] findErrorNums(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int corrected = nums[i] - 1;
            if (nums[i] != nums[corrected]) {
                swap(nums, i, corrected);
            } else {
                i++;
            }
        }


        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                return new int[]{nums[index], index + 1};
            }
        }
        return new int[]{-1, -1};

    }

    void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}