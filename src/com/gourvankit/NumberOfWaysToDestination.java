package com.gourvankit;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class NumberOfWaysToDestination {
    static class Pair{
        int first;
        int second;
        public Pair(int first,int second){
            this.first=first;
            this.second=second;
        }
    }
    public int countPaths(int n, int[][] roads) {
        ArrayList<ArrayList<Pair>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<roads.length;i++){
            adj.get(roads[i][0]).add(new Pair(roads[i][1],roads[i][2]));
            adj.get(roads[i][1]).add(new Pair(roads[i][0],roads[i][2]));
        }
        PriorityQueue<Pair> pq=new PriorityQueue<Pair>((x, y)->x.first-y.first);
        pq.add(new Pair(0,0));
        int[] ways=new int[n];
        int[] dist=new int[n];
        for(int i=0;i<n;i++){
            dist[i]=(int)1e9;
            ways[i]=0;
        }
        dist[0]=0;
        ways[0]=1;
        int modulo=(int)(1e9+7);
        while(!pq.isEmpty()){
            int dis=pq.peek().first;
            int node=pq.peek().second;
            pq.remove();
            for(Pair it:adj.get(node)){
                int adjNode=it.first;
                int ndw=it.second;
                if(dis+ndw<dist[adjNode]){
                    dist[adjNode]=dis+ndw;
                    pq.add(new Pair(dis+ndw,adjNode));
                    ways[adjNode]=ways[node];
                }else if(dis+ndw==dist[adjNode]){
                    ways[adjNode]=(ways[adjNode]+ways[node])%modulo;
                }
            }
        }
        return ways[n-1]%modulo;
    }

    public static void main(String[] args) {

    }
}
