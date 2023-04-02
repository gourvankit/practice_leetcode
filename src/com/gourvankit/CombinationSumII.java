package com.gourvankit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {
    static public void re(int[] nums,int index,int target,List<List<Integer>> myLists,List<Integer>myList){

        if(target==0){
            myLists.add(new ArrayList<>(myList));
            return;
        }
        for(int i=index;i<nums.length;i++){
            if(i>index && nums[i]==nums[i-1]) continue;
            if(nums[i]>target) break;
            myList.add(nums[i]);
            re(nums,i+1,target-nums[i],myLists,myList);
            myList.remove(myList.size()-1);
        }

    }
    static void recurr(int[] nums,int index,int target){
        int sum=0;
        if(index>=nums.length){
            sum++;
            System.out.println(sum);
            return;
        }
        recurr(nums,index+1,target-nums[index]);
        recurr(nums,index+1,target);
    }
    public static void main(String[] args) {
        int[] candidates=new int[]{10,1,2,7,6,1,5};
        int target=8;
        List<List<Integer>> mylists=new ArrayList<>();
        List<Integer> mylist=new ArrayList<>();
        Arrays.sort(candidates);
        re(candidates,0,target,mylists,mylist);
        System.out.println(mylists);
//        recurr(new int[]{3,5,6,7},0,9);
    }
}
