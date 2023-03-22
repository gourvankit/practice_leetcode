package com.gourvankit;

import java.util.*;

public class CAT1 {

    public static void main(String[] args) {
        TreeMap<Integer, String> p1 = new TreeMap<Integer, String>();
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        String name;
        int mark;
        while(num!=0)
        {
            mark=sc.nextInt();
            name=sc.next();
            p1.put(mark,name);
            num--;

        }
        Map<Integer, String> Rank = p1.descendingMap();
        System.out.println(Rank);
        int count = 0;
        for (NavigableMap.Entry<Integer, String> entry:Rank.entrySet()) {
            count++;
            String str = Integer.toString(count);
            System.out.println("Rank " + str + ": "
                    + entry.getValue());
        }}
        }







