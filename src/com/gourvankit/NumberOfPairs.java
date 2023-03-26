package com.gourvankit;

import java.util.ArrayList;
import java.util.Arrays;

public class NumberOfPairs {
    static void formPairs(int[] nums, int index, ArrayList<Integer> ls){
        if(index==2){
            System.out.println(ls);
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(ls.size()>=1 && ls.get(0)>=nums[i]) continue;
            ls.add(nums[i]);
            formPairs(nums,index+1,ls);
            ls.remove(ls.size()-1);

        }
    }
    public static void main(String[] args) {
        formPairs(new int[]{1,2,3},0,new ArrayList<>());

    }
}
