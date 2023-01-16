package com.gourvankit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class shortestPathInUndirectedGraph {
    static public int[] shortestPath(int N,int M,int[][] edges,int src){
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<N;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<M;i++){
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }
        int[] dist=new int[N];
        Queue<Integer> q=new LinkedList<>();
        for(int i = 0;i<N;i++) dist[i] = (int)1e9;
        dist[src]=0;
        q.add(src);
        while(!q.isEmpty()){
            int node=q.peek();
            q.remove();
            for(int it:adj.get(node)){
                if(dist[node]+1<dist[it]){
                    dist[it]=dist[node]+1;
                    q.add(it);
                }
            }
        }
        return dist;
    }
    public static void main(String[] args) {
        int n=9, m=10;
        int[][] edge = {{0,1},{0,3},{3,4},{4,5},{5,6},{1,2},{2,6},{6,7},{7,8},{6,8}};
        System.out.println(Arrays.toString(shortestPath(n, m, edge, 0)));
    }
}
