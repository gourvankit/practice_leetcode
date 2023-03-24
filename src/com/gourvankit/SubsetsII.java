package com.gourvankit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsII {
//    static public void recurr(int[] nums,int index,List<List<Integer>> mylists,List<Integer> mylist){
//        mylists.add(new ArrayList<>(mylist));
//        for(int i=index;i<nums.length;i++){
////            if(i!=index && nums[i]==nums[i-1]) continue;
//            mylist.add(nums[i]);
//            recurr(nums,i+1,mylists,mylist);
//            mylist.remove(mylist.size()-1);
//        }
//    }
//    public List<List<Integer>> subsetsWithDup(int[] nums) {
//        List<List<Integer>> mylists=new ArrayList<>();
//        List<Integer> mylist=new ArrayList<>();
//        Arrays.sort(nums);
//        recurr(nums,0,mylists,mylist);
//        return mylists;
//    }
static void partitionHelper(int index, String s, List < String > path, List < List < String >> res) {
    if (index == s.length()) {
        res.add(new ArrayList < > (path));
        return;
    }
    for (int i = index; i < s.length(); i++) {
        if (isPalindrome(index, i,s)) {
            path.add(s.substring(index, i + 1));
            partitionHelper(i + 1, s, path, res);
            path.remove(path.size() - 1);
        }
    }

}
    static boolean isPalindrome(int first,int end,String s){
        while(first<=end){
            if(s.charAt(first++)!=s.charAt(end--)){
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args) {
        List<List<String>> mylists=new ArrayList<>();
        List<String> mylist=new ArrayList<>();
        partitionHelper(0,"aab",mylist,mylists);
        System.out.println(mylists);


    }
}
