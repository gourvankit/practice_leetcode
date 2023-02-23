package com.gourvankit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Subsequence_with_sum_k {
    static public int recur(int[] nums,ArrayList<Integer> ls,int target,int index){
        if(index==nums.length && ls.size()>=1){
            if((ls.get(0)+ls.get(ls.size()-1))<=target){
                return 1;
            }else{
                return 0;
            }
        }
        ls.add(nums[index]);
        int x= recur(nums,ls,target, index+1);
        ls.remove(ls.size()-1);
        int y= recur(nums,ls,target,index+1);
        return x+y;
    }
    static public void findCombination(int[] nums,int index,int target,List<List<Integer>> myLists,List<Integer>myList){

        if(target==0){
            myLists.add(new ArrayList<>(myList));
            return;
        }


        for(int i=index;i<nums.length;i++){
            if(i>index && nums[i]==nums[i-1]) continue;
            if(nums[i]>target) break;
            myList.add(nums[i]);
            findCombination(nums,i+1,target-nums[i],myLists,myList);
            myList.remove(myList.size()-1);
        }


    }
    static public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> myLists=new ArrayList<>();
        List<Integer> myList=new ArrayList<>();
        Arrays.sort(candidates);
        findCombination(candidates,0,target,myLists,myList);
        return myLists;
    }
    public static void main(String[] args) {
        ArrayList<Integer> ls=new ArrayList<>();
        System.out.println((recur(new int[]{3,3,6,8},ls,9,0)));
    }
}
