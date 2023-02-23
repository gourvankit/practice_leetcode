package com.gourvankit;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseAnArray {
    public static void reverse(int[] arr,int left,int right){
        if(left>=right){
            return;
        }
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        reverse(arr,left+1,right-1);

    }
    static public void subseq(ArrayList<Character> s1, int index, ArrayList<Character> t,
                              ArrayList<Character> formed, ArrayList<Integer> count ){
        if(index>=s1.size()){
            if(formed.equals(t)){
                count.add(index);
            }
            return;
        }
        formed.add(s1.get(index));
        subseq(s1,index+1,t,formed,count);
        formed.remove(formed.size()-1);
        subseq(s1,index+1,t,formed,count);

    }
    public static void main(String[] args) {

//        int[] arr=new int[]{1,2,3,4};
//        reverse(arr,0,3);
//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
        String s="babgbag";
        String t="bag";
        ArrayList<Character> s1=new ArrayList<>();
        ArrayList<Character> s2=new ArrayList<>();
        ArrayList<Integer> count=new ArrayList<>();
        ArrayList<Character> formed=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            s1.add(s.charAt(i));
        }
        for(int i=0;i<t.length();i++){
            s2.add(t.charAt(i));
        }
        subseq(s1,0,s2,formed,count);
        System.out.println(count.size());
    }
}
