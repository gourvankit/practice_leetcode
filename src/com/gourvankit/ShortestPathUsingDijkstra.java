package com.gourvankit;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class ShortestPathUsingDijkstra {
    static class Pair{
        int node;
        int distance;

        public Pair(int node, int distance) {
            this.node = node;
            this.distance = distance;
        }
    }
    static public void distanceDij(int n,int m,int[][] edges){
        ArrayList<ArrayList<Pair>> adj=new ArrayList<>();
        ArrayList<Integer> shortestPath=new ArrayList<>();
        int[] dis=new int[edges.length];
        int[] memo=new int[edges.length];
        for(int i=0;i<edges.length;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i< edges.length;i++){
            adj.get(edges[i][0]).add(new Pair(edges[i][1],edges[i][2]));
            adj.get(edges[i][1]).add(new Pair(edges[i][0],edges[i][2]));
        }
        for(int i=0;i<edges.length;i++){
            memo[i]=i;
        }
        PriorityQueue<Pair> pq=new PriorityQueue<Pair>((x,y)->x.distance-y.distance);
        pq.add(new Pair(0,1));
        dis[1]=0;
        while(!pq.isEmpty()){
            int node=pq.peek().node;
            int weight=pq.peek().distance;
            pq.remove();
            for(Pair it:adj.get(node)){
                int adjNode=it.node;
                int height=it.distance;
                if(weight+height<dis[adjNode]){
                    dis[adjNode]=weight+height;
                    pq.add(new Pair(adjNode,weight+height));
                    memo[adjNode]=node;
                }
            }
        }
        int node=n;
        while(memo[node]!=node){
            shortestPath.add(node);
            node=memo[node];
        }

    }
    public static void main(String[] args) {

    }
}
