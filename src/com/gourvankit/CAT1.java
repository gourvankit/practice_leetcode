package com.gourvankit;

import java.util.*;

public class CAT1 {

    public static void main(String[] args) {
        HashMap<Integer,Integer> m=new HashMap<>();
        String s="12223344";
        char[][] arr=new char[][]{{'*'},{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},
                {'m','n','o'},{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};
        ArrayList<Integer> myList=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            int n=Integer.parseInt(String.valueOf(s.charAt(i)));
            if(m.containsKey(n)){
                m.put(n,m.get(n)+1);
            c}else{
                m.put(n,1);
                myList.add(n);
            }
        }
        StringBuilder ans= new StringBuilder();
        for(int it:myList){
            int index=it;
            int times=m.get(index);
            ans.append(arr[index][times - 1]);
        }
        System.out.println(ans);
         }
    }







