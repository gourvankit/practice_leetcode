package com.gourvankit;

public class FindDuplicate {
    public int findDuplicate(int[] nums) {
        int sp=nums[0];
        int fp=nums[0];
        do{
            sp=nums[sp];
            fp=nums[nums[fp]];
        }while(sp!=fp);
        fp=nums[0];
        while(fp!=sp){
            fp=nums[fp];
            sp=nums[sp];
        }
        return sp;
    }

    public static void main(String[] args) {

    }
}
