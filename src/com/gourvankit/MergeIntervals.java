package com.gourvankit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a, b)->a[0]-b[0]);
        List<int[]> ls=new ArrayList<>();
        int start=intervals[0][0];
        int end=intervals[0][1];
        for(int[] it:intervals){
            if(it[0]<=end){
                end=Math.max(end,it[1]);
            }else{
                ls.add(new int[]{start,end});
                start=it[0];
                end=it[1];
            }
        }
        ls.add(new int[]{start,end});
        return ls.toArray(new int[0][]);
    }
    public static void main(String[] args) {
       int[] arr=new int[]{1,2,3,4};
       int i=0;
       int j=arr.length-1;
       while(i<=j){
           int temp=arr[i];
           arr[i]=arr[j];
           arr[j]=temp;
           i++;
           j--;
       }
        System.out.println(Arrays.toString(arr));

    }
}
