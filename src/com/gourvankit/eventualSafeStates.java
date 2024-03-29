package com.gourvankit;

import java.util.ArrayList;
import java.util.List;

//Eventual safe states are those states which do not form cycle in a directed graph
public class eventualSafeStates {
    static public boolean dfsCheck(int node, ArrayList<ArrayList<Integer>> adj, int[] vis,
                                   int[] pathVis){
        vis[node] = 1;
        pathVis[node] = 1;
        for (int it : adj.get(node)) {
            if (vis[it] == 0) {
                if (dfsCheck(it, adj, vis, pathVis))
                    return true;
            }

            else if (pathVis[it] == 1) {
                return true;
            }
        }
        pathVis[node] = 0;
        return false;
    }
    static public ArrayList<Integer> eventualStates(int V,ArrayList<ArrayList<Integer>> adj){
        int[] vis=new int[V];
        int[] pathVis=new int[V];
        int[] check=new int[V];
        for(int i=0;i<V;i++){
            if(vis[i]==0){
                dfsCheck(i,adj,vis,pathVis);
            }
        }
        ArrayList<Integer> myList=new ArrayList<>();
        for(int i=0;i<pathVis.length;i++){
            if(pathVis[i]==0){
                myList.add(i);
            }
        }
        return  myList;
    }
    public static void main(String[] args) {
//        int V = 12;
//        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
//        for (int i = 0; i < V; i++) {
//            adj.add(new ArrayList<>());
//        }
//        adj.get(0).add(1);
//        adj.get(1).add(2);
//        adj.get(2).add(3);
//        adj.get(3).add(4);
//        adj.get(3).add(5);
//        adj.get(4).add(6);
//        adj.get(5).add(6);
//        adj.get(6).add(7);
//        adj.get(8).add(1);
//        adj.get(8).add(9);
//        adj.get(9).add(10);
//        adj.get(10).add(8);
//        adj.get(11).add(9);
//        System.out.println(eventualStates(V,adj));
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            adj.add(new ArrayList<>());
        }
        int[][] graph=new int[][]{{1,2},{2,3},{5},{0},{5},{},{}};
            for(int i=0;i<graph.length;i++){
                for(int j=0;j<graph[i].length;j++){
                    adj.get(i).add(graph[i][j]);
                }
            }
        System.out.println(adj.get(0));




    }
}
