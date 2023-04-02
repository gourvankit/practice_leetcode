package com.gourvankit;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lss=new ArrayList<>();
        List<Integer> ls=new ArrayList<>();
        List<Integer> ls1=new ArrayList<>();
        ls.add(1);
        lss.add(new ArrayList<>(ls));
        if(numRows==1){
            return lss;
        }
        while(numRows-1>0){
            for(int i=0;i<ls.size();i++){
                if(i==0) ls1.add(ls.get(i));
                if(i==ls.size()-1) ls1.add(ls.get(i));
                else{
                    ls1.add(ls.get(i)+ls.get(i+1));
                }
            }
            ls=new ArrayList<>(ls1);
            lss.add(new ArrayList<>(ls1));
            ls1.clear();
            numRows--;
        }
        return lss;
    }
    public static void main(String[] args) {

    }
}
