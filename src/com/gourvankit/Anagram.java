package com.gourvankit;

import java.util.*;

public class Anagram {
    public static void groupAnagrams(String[] strs) {
        List<List<String>> myList=new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            List<String> myList2=new ArrayList<>(Arrays.asList(strs[i].split("")));
            Collections.sort(myList2);
            myList.add(myList2);
        }
        
        System.out.println(myList);
    }

    public static void main(String[] args) {
        groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"});


    }
}
