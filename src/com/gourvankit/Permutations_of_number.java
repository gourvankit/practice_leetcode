package com.gourvankit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations_of_number {
    static void permu(int[] nums,List<List<Integer>> myLists,int index){
        if(index==nums.length){
            List<Integer> ls=new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                ls.add(nums[i]);
            }
            myLists.add(new ArrayList<>(ls));
            return;
        }
        for(int i=index;i<nums.length;i++){
            swap(nums,i,index);
            permu(nums,myLists,index+1);
            swap(nums,i,index);
        }
    }
    static void swap(int[] nums,int vl1,int vl2){
        int temp=nums[vl2];
        nums[vl2]=nums[vl1];
        nums[vl1]=temp;
    }
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
        List<List<Integer>> myLists=new ArrayList<>();
        permu(new int[]{1,2,3},myLists,0);
        System.out.println(myLists);
    }
}
