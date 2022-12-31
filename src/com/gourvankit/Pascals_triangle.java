package com.gourvankit;

import java.util.*;

public class Pascals_triangle {
    static List<List<Integer>> compute(int numRows){
        List<List<Integer>> lst = new ArrayList<>();
        if(numRows == 0) return lst;
        List<Integer> inner_lst = new ArrayList<>();
        inner_lst.add(1);
        lst.add(inner_lst);
        if(numRows == 1) return lst;
        List<Integer> prevlst = inner_lst;


        for(int i = 1; i < numRows; i++) {
            List<Integer> newlist = new ArrayList<Integer>();
            newlist.add(1);
            for(int j = 0; j < prevlst.size()-1; j++) {
                newlist.add(prevlst.get(j) + prevlst.get(j+1));
            }
            newlist.add(1);
            lst.add(newlist);
            prevlst = newlist;
        }
        return lst;
    }
    public static void main(String[] args) {
        System.out.println(compute(5));
    }
}
