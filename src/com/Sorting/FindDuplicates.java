package com.Sorting;
//LeetCode: 442

import java.util.ArrayList;
import java.util.List;

import static com.Sorting.CyclicSort.swap;

class FindDuplicates {
    public List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        while (i < nums.length) {

            int corrected = nums[i] - 1;
            if (nums[i] != nums[corrected]) {
                swap(nums, i, corrected);
            } else {
                i++;
            }
        }


        List<Integer> res = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                res.add(nums[index]);
            }
        }
        return res;
    }

    void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}