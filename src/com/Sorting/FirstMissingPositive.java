package com.Sorting;

//LeetCode: 41
class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        int i = 0;
        int n = nums.length;
        while (i < n) {
            int correct = nums[i] - 1;
            if ((nums[i] > 0) && (nums[i] <= n) && (nums[i] != nums[correct])) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        for (int index = 0; index < n; index++) {
            if (nums[index] != index + 1) {
                return index + 1;
            }
        }
        return n + 1;
    }

    void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}
