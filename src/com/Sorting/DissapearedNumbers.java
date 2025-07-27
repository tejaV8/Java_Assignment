package com.Sorting;
//Leetcode: 448

import java.util.ArrayList;
import java.util.List;

class DissapearedNumbers {


    void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int corrected = nums[i] - 1;
            if (nums[i] != nums[corrected]) {
                swap(nums, i, corrected);
            } else {
                i++;
            }
        }

        List<Integer> res = new ArrayList();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                res.add(index);
            }
        }
        return res;
    }
}