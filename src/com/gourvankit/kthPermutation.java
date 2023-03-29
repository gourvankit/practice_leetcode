package com.gourvankit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class kthPermutation {
    static String getPerm(int n,int k){
        ArrayList<Integer> number=new ArrayList<>();
        String s="";
        int fact=1;
        for(int i=1;i<n;i++){
            fact*=i;
            number.add(i);
        }
        number.add(n);
        k=k-1;
        while(true){
            s=s+number.get(k/fact);
            number.remove(k/fact);
            if(number.size()==0){
                break;
            }
            k=k%fact;
            fact=fact/number.size();
        }
        return s;
    }
    public static void main(String[] args) {

    }
}
