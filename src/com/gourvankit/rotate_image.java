package com.gourvankit;

import java.util.Arrays;

public class rotate_image {
    public static void rotate(int[][] matrix) {
        int l=0;
        int r=matrix.length-1;
        while(l<r){
            for(int i=0;i<r-l;i++){
                int top=l;
                int bottom=r;
                int temp=matrix[top][l+i];
                matrix[top][l+i]=matrix[bottom-i][l];
                matrix[bottom-i][l]=matrix[bottom][r-i];
                matrix[bottom][r-i]=matrix[top+i][r];
                matrix[top+i][r]=temp;
            }
            l+=1;
            r-=1;
        }
        
    }
    public static void main(String[] args) {
        rotate(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
//        [[1,2,3],[4,5,6],[7,8,9]]
//        [[7,4,1],[8,5,2],[9,6,3]]

    }
}
