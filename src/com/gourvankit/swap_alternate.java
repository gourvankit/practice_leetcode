package com.gourvankit;

import java.util.Arrays;

public class swap_alternate {
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,4,5,6};
        int start=0;
        int last=1;
        while(last<arr.length){
            int temp=arr[last];
            arr[last]=arr[start];
            arr[start]=temp;
            start+=2;
            last+=2;
        }
        System.out.println(Arrays.toString(arr));
    }
}
