package com.gourvankit;

import java.util.ArrayList;

public class NumberOfProvinces {
    static public void solveDfs(int node,ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> dfs,boolean[] visited){
        visited[node]=true;
            for(int n1:adj.get(node)){
                if(!visited[n1]){
                    solveDfs(n1,adj,dfs,visited);
                }
            }
    }
    static public Integer dfsOfGraph(int V,ArrayList<ArrayList<Integer>> adj){
        boolean[] visited=new boolean[V];
        ArrayList<Integer> dfs=new ArrayList<>();
        int counter=0;
        for(int i=1;i<V;i++) {
            counter++;
            if(!visited[i]){
                solveDfs(0,adj,dfs,visited);
            }
        }
        return counter;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer> >();

        adj.add(new ArrayList<Integer>());
        adj.get(0).add(0, 1);
        adj.get(0).add(1, 0);
        adj.get(0).add(2, 1);
        adj.add(new ArrayList<Integer>());
        adj.get(1).add(0, 0);
        adj.get(1).add(1, 1);
        adj.get(1).add(2, 0);
        adj.add(new ArrayList<Integer>());
        adj.get(2).add(0, 1);
        adj.get(2).add(1, 0);
        adj.get(2).add(2, 1);
        System.out.println(dfsOfGraph(3,adj));
    }
}
