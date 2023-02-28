package com.gourvankit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsequence {
    static public void subs(int[] nums,int index,List<Integer> myList,List<List<Integer>> myLists){
        if(index>=nums.length){
            myLists.add(new ArrayList<>(myList));
                return;
        }
        myList.add(nums[index]);
        subs(nums,index+1,myList,myLists);
        myList.remove(myList.size()-1);
        subs(nums,index+1,myList,myLists);

    }
    public static void main(String[] args) {
        List<Integer> myLists=new ArrayList<>();
        List<List<Integer>> myLists2=new ArrayList<>();
        subs(new int[]{1,2,2,3,3},0,myLists,myLists2);

        int maxProduct=0;
        System.out.println(myLists2);
        for(int i=0;i<myLists2.size()-1;i++){
            int sum=0;
            for(int j=0;j<myLists2.get(i).size();j++){
                sum+=myLists2.get(i).get(j);
            }
//            System.out.print(sum);
//            System.out.print(myLists2.get(i).get(0));
//            System.out.println();
            maxProduct=Math.max(sum*myLists2.get(i).get(0),maxProduct);
        }
        System.out.println(maxProduct);

    }
}
