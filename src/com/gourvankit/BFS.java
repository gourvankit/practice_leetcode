package com.gourvankit;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {
    static public List<Integer> bfs(int V, ArrayList<ArrayList<Integer>> adj){
        List<Integer> bfs=new ArrayList<>();
        boolean[] visited=new boolean[V];
        Queue<Integer> q=new LinkedList<>();
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
    public static void main(String[] args) {
        ArrayList < ArrayList < Integer >> adj = new ArrayList < > ();
        for (int i = 0; i < 5; i++) {
            adj.add(new ArrayList < > ());
        }
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(4);
        adj.get(4).add(0);
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(1).add(3);
        adj.get(3).add(1);
        System.out.println(bfs(5,adj));

    }
}
