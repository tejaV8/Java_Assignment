package com.Sorting;

//LeetCode - 268
class Solution {
    public int missingNumber(int[] nums) {
        int i = 0;
        int n = nums.length;
        while (i < n) {
            int correct = nums[i];
            if ((nums[i] < n) && (nums[i] != nums[correct])) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        for (int index = 0; index < n; index++) {
            if (nums[index] != index) {
                return index;
            }
        }
        return n;
    }

    void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}