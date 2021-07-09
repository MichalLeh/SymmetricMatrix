package com.gfa.exam;

public class Main {

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 5, 1},
            {5, 2, 3},
            {1, 3, 5}
        };

        System.out.println(isSymmetric(matrix));
    }

    public static boolean isSymmetric(int[][] matrix){
        int firstCol = 0;
        int lastCol = matrix.length - 1;

        // skip first and last value in the matrix
        for(int row=1; row<=matrix.length-1; row++){

            // check if values in first column are equal to values in first row and if values in last column are equal to values in last row
            if((matrix[row][firstCol] != matrix[firstCol][row]) || (matrix[row][lastCol] != matrix[lastCol][row])){
                return false;
            }
        }
        return true;
    }
}
