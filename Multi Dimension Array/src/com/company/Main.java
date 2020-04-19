package com.company;

public class Main {

    public static void main(String[] args) {
        int[] values = { 1, 2, 3, 4, 5 };
        int[][] grid = {
                {2, 3, 4, 5, 6, 7},
                { 0, 9, 8, 7},
                { 5, 6, 7, 8, 11}
        };
        for (int val: values) {
            System.out.print(val + "\t");
        }

        // Multi dimension array

        for (int row = 0; row < grid.length; row ++) {
            for (int col = 0; col < grid[row].length; col++) {
                System.out.print(grid[row][col] + "\t");
            }
        }
    }
}
