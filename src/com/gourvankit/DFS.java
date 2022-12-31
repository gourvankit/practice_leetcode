package com.gourvankit;

import java.util.ArrayList;
import java.util.List;

public class DFS {
    static public void dfs(int node, boolean[] visited, ArrayList<ArrayList<Integer>> adj, List<Integer> dfs ){
        visited[node]=true;
        dfs.add(node);
        for(int n:adj.get(node)){
            if(!visited[n]){
                dfs(n,visited,adj,dfs);
            }
        }
    }
    static public  ArrayList<Integer> dfsOfGraph(int V,ArrayList<ArrayList<Integer>> adj){
        boolean[] visited=new boolean[V];
        ArrayList<Integer> ls = new ArrayList<>();
        dfs(0, visited, adj, ls);
        return ls;
    }
    public static void main(String[] args) {
        ArrayList < ArrayList < Integer >> adj = new ArrayList < > ();
        for (int i = 0; i < 5; i++) {
            adj.add(new ArrayList < > ());
        }
        adj.get(0).add(2);
        adj.get(2).add(0);
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(3);
        adj.get(3).add(0);
        adj.get(2).add(4);
        adj.get(4).add(2);
        System.out.println(dfsOfGraph(5,adj));
    }
}
