package com.gourvankit;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Stack;

public class TopolgicalSortingUsingDFS {
    // This is a type of sorting within the vertex of the graphs and is applicable to only
    // DAG(Directed acyclic graph). It is linear ordering of the vertices such that if there is
    // edge between two vertices u & v then u must occur before v.
    static public void dfs(int index,int[] vis, Stack<Integer> myStack,ArrayList<ArrayList<Integer>> adj){
        vis[index]=1;
        for(int it:adj.get(index)){
            if(vis[it]==0){
                dfs(it,vis,myStack,adj);
            }
        }
        myStack.add(index);
    }
    static public int[] topologicalSort(ArrayList<ArrayList<Integer>> adj,int V){
        int[] vis=new int[V];
        Stack<Integer> myStack=new Stack<>();
        for(int i=0;i<V;i++){
            if(vis[i]==0){
                dfs(i,vis,myStack,adj);
            }
        }
        int ans[] = new int[V];
        int i = 0;
        while (!myStack.isEmpty()) {
            ans[i++] = myStack.peek();
            myStack.pop();
        }
        return ans;
    }
    public static void main(String[] args) {
        int V = 6;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(2).add(3);
        adj.get(3).add(1);
        adj.get(4).add(0);
        adj.get(4).add(1);
        adj.get(5).add(0);
        adj.get(5).add(2);
       int[] ans=topologicalSort(adj,V);
       for(int it:ans){
           System.out.print(it+" ");
       }

    }
}
