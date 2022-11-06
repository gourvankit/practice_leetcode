package com.gourvankit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Duplicate_in_array {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(2);
        arr.add(2);
        arr.add(1);
        arr.add(3);
        arr.add(4);
        Map<Integer,Integer> myMap=new HashMap<>();
        for (Integer integer : arr) {
            if (myMap.containsKey(integer)) {
                myMap.put(integer, myMap.get(integer) + 1);
            } else {
                myMap.put(integer, 1);
            }
        }
        for(int i=0;i< myMap.size();i++){
            if(myMap.get(arr.get(i))>1){
                System.out.println(arr.get(i));
            }
        }
        System.out.println(myMap.values());
    }
}
