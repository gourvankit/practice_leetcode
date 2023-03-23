package com.gourvankit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Subsequence {
    static public void subs(int[] nums,int index,List<Integer> myList){
        if(index>=nums.length){
            int sum=0;
            for(int c:myList){
                sum+=c;
            }
//            System.out.println(myList);
//            System.out.println(sum);
                return;
        }
        myList.add(nums[index]);
        subs(nums,index+1,myList);
        myList.remove(myList.size()-1);
        subs(nums,index+1,myList);

    }
    static void subsetSumsHelper(int ind, int sum, ArrayList < Integer > arr, int N, ArrayList < Integer > sumSubset) {
        if (ind == N) {
            sumSubset.add(sum);
            return;
        }

        // pick the element
        subsetSumsHelper(ind + 1, sum + arr.get(ind), arr, N, sumSubset);

        // Do-not pick the element
        subsetSumsHelper(ind + 1, sum, arr, N, sumSubset);
    }

    static ArrayList < Integer > subsetSums(ArrayList < Integer > arr, int N) {

        ArrayList < Integer > sumSubset = new ArrayList < > ();
        subsetSumsHelper(0, 0, arr, N, sumSubset);
        Collections.sort(sumSubset);
        return sumSubset;
    }

    public static void main(String[] args) {
        ArrayList < Integer > arr = new ArrayList < > ();
        arr.add(3);
        arr.add(1);
        arr.add(2);
        ArrayList < Integer > ans = subsetSums(arr, arr.size());
        Collections.sort(ans);
        System.out.println("The sum of each subset is ");
        for (int i = 0; i < ans.size(); i++)
            System.out.print(ans.get(i) + " ");

    }
}
