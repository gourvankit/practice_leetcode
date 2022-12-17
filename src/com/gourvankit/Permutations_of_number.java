package com.gourvankit;

import java.util.ArrayList;
import java.util.List;

public class Permutations_of_number {
   static public void compute(int[] nums,List<Integer> myList,boolean[] flags,int index){
       if(index==nums.length){
           System.out.println(myList);
           return;
       }
       for(int i=0;i<nums.length;i++){
           if(!flags[i]){
               flags[i]=true;
               myList.add(nums[i]);
               compute(nums,myList,flags,index+1);
               myList.remove(myList.size()-1);
               flags[i]=false;
           }
       }

    }

    static public void permute(int[] nums) {
        List<Integer> myList=new ArrayList<>();
        boolean[] flags=new boolean[nums.length];
        compute(nums,myList,flags,0);

    }
    public static void main(String[] args) {
      permute(new int[]{1,2,3});
    }
}
