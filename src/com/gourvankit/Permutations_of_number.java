package com.gourvankit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations_of_number {
   static public void backtrack(int[] nums,List<Integer> myList,List<List<Integer>> myLists,int index,boolean[] flags){
       if (myList.size()==nums.length){
           myLists.add( new ArrayList<>(myList));
           return;
       }
       for(int i=0;i<nums.length;i++){
               if(!flags[i]){
                   flags[i]=true;
                   myList.add(nums[i]);
                   backtrack(nums,myList,myLists,index+1,flags);
                   myList.remove(myList.size()-1);
                   flags[i]=false;
               }
       }

   }

    static public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> myLists=new ArrayList<>();
        List<Integer> myList=new ArrayList<>();
        boolean[] flags=new boolean[nums.length];
        Arrays.sort(nums);
        backtrack(nums,myList,myLists,0,flags);
        return myLists;

    }
    public static void main(String[] args) {
        List<List<Integer>> myLists=permute(new int[]{1,1,2});
        System.out.println(myLists);
    }
}
