package org.app;

import java.util.Arrays;

public class MatrixSetZeroes {
    public static void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[] row_zero = new int[rows];
        int[] col_zero = new int[cols];

        Arrays.fill(row_zero, 1);
        Arrays.fill(col_zero, 1);

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(matrix[i][j]==0){
                    row_zero[i]=0;
                    col_zero[j]=0;
                }
            }
        }

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(row_zero[i]==0 || col_zero[j]==0){
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args){
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        MatrixSetZeroes.setZeroes(matrix);
    }
}
