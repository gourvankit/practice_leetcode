package com.gourvankit;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CycleInUndirectedGraph {
    static class Pair{
        int first;
        int second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
    static public boolean checkCycleDFS(int src,int parent, int V, ArrayList<ArrayList<Integer>> adj){
        boolean[] vis=new boolean[V];
        vis[src]=true;

        for(int it:adj.get(src)){
            if(!vis[it]){
               if(checkCycleDFS(it,src, V, adj)){
                   return true;
               };
            }else if(parent!=it){
                return true;
            }
        }
        return false;
    }
    static public boolean checkCycle(int src, int V, ArrayList<ArrayList<Integer>> adj){
        boolean[] vis=new boolean[V];
        vis[src]=true;
        Queue<Pair> myQ=new LinkedList<>();
        myQ.add(new Pair(src,-1));
        while(!myQ.isEmpty()){
            int node=myQ.peek().first;
            int parent=myQ.peek().second;
            myQ.remove();
            for(int i:adj.get(node)){
                if(!vis[i]){
                    vis[i]=true;
                    myQ.add(new Pair(i,node));

                }else if(parent!=i){
                    return true;
                }
            }
        }
        return false;

    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            adj.add(new ArrayList < > ());
        }
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(2).add(3);
        adj.get(3).add(2);
        System.out.println(checkCycle(1,4,adj));
    }
}
