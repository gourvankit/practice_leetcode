package com.gourvankit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsII {
    static public void recurr(int[] nums,int index,List<List<Integer>> mylists,List<Integer> mylist){
        mylists.add(new ArrayList<>(mylist));
        for(int i=index;i<nums.length;i++){
//            if(i!=index && nums[i]==nums[i-1]) continue;
            mylist.add(nums[i]);
            recurr(nums,i+1,mylists,mylist);
            mylist.remove(mylist.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> mylists=new ArrayList<>();
        List<Integer> mylist=new ArrayList<>();
        Arrays.sort(nums);
        recurr(nums,0,mylists,mylist);
        return mylists;
    }
    public static void main(String[] args) {
        List<List<Integer>> mylists=new ArrayList<>();
        List<Integer> mylist=new ArrayList<>();
        recurr(new int[]{1,2,3},0,mylists,mylist);
        System.out.println(mylists);

    }
}
