package com.gourvankit;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class eventualSafeStatesUsingTopoSort {
    static public ArrayList safeNodes(int V, ArrayList<ArrayList<Integer>> adj){
        ArrayList<ArrayList<Integer>> adjRev=new ArrayList<>();
        for(int i=0;i<V;i++){
            adjRev.add(new ArrayList<>());
        }
        int[] indegree=new int[V];
        for(int i=0;i<V;i++){
            for(int it:adj.get(i)){
                adjRev.get(it).add(i);
                indegree[i]++;
            }
        }
        ArrayList<Integer> safeNodes=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<V;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            int node=q.peek();
            q.remove();
            safeNodes.add(node);
            for(int it:adjRev.get(node)){
                indegree[it]--;
                if(indegree[it]==0){
                   q.add(it);
                }
            }
        }
        return safeNodes;
    }
    public static void main(String[] args) {

    }
}
