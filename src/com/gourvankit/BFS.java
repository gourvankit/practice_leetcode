package com.gourvankit;

import java.util.*;

public class BFS {
    static public List<Integer> bfs(int V, ArrayList<ArrayList<Integer>> adj){
        List<Integer> bfs=new ArrayList<>();
        boolean[] visited=new boolean[V];
        Queue<Integer> q=new LinkedList();
        q.add(0);
        visited[0]=true;
        while(!q.isEmpty()){
            int node=q.poll();
            bfs.add(node);
            for(int i:adj.get(node)){
                if(!visited[i]){
                    visited[i]=true;
                    q.add(i);
                }
            }
        }
        return bfs;

    }
    static public void test(int[][] graph){
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<graph.length;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<graph.length;i++){
            for(int j=0;j<graph[i].length;j++){
                adj.get(i).add(graph[i][j]);

            }
        }
        System.out.println(adj);
    }
    public static void main(String[] args) {
//
        System.out.println('d'-'a');
    }
}
