package com.gourvankit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsequence {
    static public void subs(int[] nums,int index,List<Integer> myList){
        if(index>=nums.length){
            System.out.println(myList);
                return;
        }
        myList.add(nums[index]);
        subs(nums,index+1,myList);
        myList.remove(myList.indexOf(nums[index]));
        subs(nums,index+1,myList);

    }
    public static void main(String[] args) {
        List<Integer> myLists=new ArrayList<>();
        subs(new int[]{1,2,3,4},0,myLists);
//        System.out.println(myLists);

    }
}
