package com.gourvankit;

import java.util.Arrays;

public class rotate_image {
    public static void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                int temp=matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j]=matrix[i][j];
                matrix[i][j]=temp;
            }
        }
        
    }
    public static void main(String[] args) {
        rotate(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
//        [[1,2,3],[4,5,6],[7,8,9]]
//        [[7,4,1],[8,5,2],[9,6,3]]

    }
}
