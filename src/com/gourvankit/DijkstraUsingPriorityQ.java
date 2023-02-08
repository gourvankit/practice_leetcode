package com.gourvankit;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class DijkstraUsingPriorityQ {
    static class Pair{
        int node;
        int distance;
        public Pair(int distance,int node){
            this.node = node;
            this.distance = distance;
        }
    }
    static public int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj,int src){
        PriorityQueue<Pair> pq=new PriorityQueue<>((x,y)-> x.distance-y.distance);
        int[] distance=new int[V];
        for(int i=0;i<V;i++){
            distance[i]= (int) 1e9;
        }
        distance[src]=0;
        pq.add(new Pair(0,src));
        while(!pq.isEmpty()){
            int node=pq.peek().node;
            int weight=pq.peek().distance;
            pq.remove();
            for(int i=0;i<adj.get(node).size();i++){
                int adjNode=adj.get(node).get(i).get(0);
                int height=adj.get(node).get(i).get(1);
                if(weight+height<distance[adjNode]){
                    distance[adjNode]=weight+height;
                    pq.add(new Pair(distance[adjNode],adjNode ));
                }
            }
        }
        return distance;
    }
    public static void main(String[] args) {

    }
}
