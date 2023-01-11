package com.gourvankit;

import java.util.ArrayList;

public class CycleInDirectedGraph {
    static public boolean checkCycle(int node,ArrayList<ArrayList<Integer>> adj,int[] vis,int[] path){
        vis[node]=1;
        path[node]=1;
        for(int it:adj.get(node)){
            if(vis[it]==0){
                if(checkCycle(it, adj, vis, path)){
                    return true;
                }
            }
            else if(path[it]==1){
                return true;
            }
        }
        path[node]=0;
        return false;
    }
    public static void main(String[] args) {

    }
}
