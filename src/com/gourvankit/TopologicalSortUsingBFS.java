package com.gourvankit;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

// This algorithm is also called Kahn's algorithm. The best way to find out whether the
// graph has a cycle or not is to use topo sort algo and if the size of the topo array equals
// to the number of vertex then it does not have cycle.
public class TopologicalSortUsingBFS {
    static public int[] topologicalSort(int V, ArrayList<ArrayList<Integer>> adj){
        int[] indegree=new int[V];
        for(int i=0;i<V;i++){
            for(int it:adj.get(i)){
                indegree[it]++;
            }
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<V;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        int[] topo=new int[V];
        int i=0;
        while(!q.isEmpty()){
            int node=q.peek();
            q.remove();
            topo[i++]=node;
            for(int its:adj.get(node)){
                indegree[its]--;
                if(indegree[its]==0){
                    q.add(its);
                }
            }
        }
        return topo;
    }
    public static void main(String[] args) {

    }
}
