package com.BinarySearch;

import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {

        int[][] matrix = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };

        int target = 25;

        System.out.println(Arrays.toString(rowColMatrix(matrix, target)));
    }

    public static int[] rowColMatrix(int[][] matrix, int target) {
        int row = 0;                           // Start from the top row
        int col = matrix[0].length - 1;        // Start from the last column (top-right corner)

        // Loop until we are inside the matrix boundaries
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return new int[]{row, col};    // Target found, return its position
            } else if (matrix[row][col] > target) {
                col--;                         // Move left if current element is too big
            } else {
                row++;                         // Move down if current element is too small
            }
        }

        // If not found, return [-1, -1]
        return new int[]{-1, -1};
    }
}
