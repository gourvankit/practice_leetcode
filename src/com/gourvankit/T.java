package com.gourvankit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

public class T {
    // You are using Java
        static class Node{
            int data;
            Node left;
            Node right;
            Node(){};
            Node(int n){
                data=n;
                left = right = null;
            }
        }
        static void preOrder(Node node){
            Node curr=node;
            System.out.println(curr.data+" ");
            preOrder(curr.left);
            preOrder(curr.right);
        }
    static public void compress(char[] chars) {
        HashMap<Character,Integer> map=new HashMap<>();
        ArrayList<Character> ls=new ArrayList<>();
        for(int i=0;i<chars.length;i++){
            if(map.containsKey(chars[i])){
                map.put(chars[i],map.get(chars[i])+1);
            }else{
                map.put(chars[i],1);
                ls.add(chars[i]);
            }
        }
        StringBuilder s= new StringBuilder();
        for(int i=0;i<ls.size();i++){
            if(map.get(ls.get(i))!=1){
                s.append(ls.get(i));
                s.append(map.get(ls.get(i)));
            }else{
                s.append(ls.get(i));
            }
        }
        System.out.println(s.length());
    }
    static class Pair{
        int data;
        int index;
        int jump;
        public Pair(int data,int index,int jump) {
            this.data=data;
            this.jump=jump;
            this.index=index;
        }
    }
    static public int findKthPositive(int[] arr, int k) {
        ArrayList<Integer> ls=new ArrayList<Integer>();
        ArrayList<Integer> Nols=new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++){
            ls.add(arr[i]);
        }
        for(int i=1;i<=arr[arr.length-1]+k;i++){
            if(!ls.contains(i)){
                Nols.add(i);
            }

        }
        return Nols.get(k-1);


    }

        public static void main(String[] args){
            System.out.println(findKthPositive(new int[]{2,3,4,7,11},5));

        }
}
// You are using Java

