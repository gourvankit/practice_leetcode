package com.gourvankit;

import java.util.ArrayList;
import java.util.HashMap;

public class TwoSum {
    public static void twoSum(int[] arr,int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> ls=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int tofind=target-arr[i];
            if(map.containsKey(tofind)){
                ls.add(map.get(tofind));
                ls.add(i);
                System.out.println(ls);
            }else{
                map.put(arr[i],i);
            }

        }
    }
    public static void main(String[] args) {
        twoSum(new int[]{3,2,4},6);
    }
}
