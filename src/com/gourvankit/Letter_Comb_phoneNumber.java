package com.gourvankit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Letter_Comb_phoneNumber {
    static public String[] findString(String digits){
        String[] arr=new String[2];
        String[] charac=new String[]{"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
       String[] digit=digits.split("");
       arr[0]=charac[Integer.parseInt(digit[0])-2];
       arr[1]=charac[Integer.parseInt(digit[1])-2];
       return arr;
    }
    static public void combination(String[] first, HashSet<String> mySet,String[] second,int index,List<String> myList){
        if(index>=second.length){
            mySet.addAll(myList);
            return;
        }
        for(int i=0;i<second.length;i++){
            String s="";
            s+=first[i];
            s+=second[index];
            myList.add(s);
            combination(first,mySet,second,index+1,myList);
        }

    }

    public static void main(String[] args) {

        String[] arr;
        arr=findString("26");
        String[] first=arr[0].split("");
        String[] second=arr[1].split("");
        HashSet<String> mySet=new HashSet<>();
        combination(first,mySet,second,0,new ArrayList<>());

        System.out.println(mySet);
    }
}
