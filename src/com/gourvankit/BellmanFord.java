package com.gourvankit;

import java.util.ArrayList;
import java.util.Arrays;

public class BellmanFord {
    static public int[] bellmanFord(int v, ArrayList<ArrayList<Integer>> ls,int s){
        int[] dist=new int[v];
        Arrays.fill(dist,(int)1e8);
        dist[s]=0;
        for(int i=0;i<v-1;i++){
            for(ArrayList<Integer> it:ls){
                int node=it.get(0);
                int adjNode=it.get(1);
                int weight=it.get(2);
                if(dist[adjNode]!=(int) 1e8 && dist[node]+weight<dist[adjNode]){
                    dist[adjNode]=dist[node]+weight;
                }
            }
        }
        // One more iteration is to be performed so that no more shorter path is
        // available because we are in a loop
        // if we are in a loop then the min will change again and again and thus means
        // that the graph has -ve cycle
        for(ArrayList<Integer> it:ls){
            int u=it.get(0);
            int adn=it.get(1);
            int wt=it.get(2);
            if(dist[adn]!=(int) 1e8 && dist[u]+wt<dist[adn]){
                int[] tmp=new int[1];
                tmp[0]=-1;
                return tmp;
            }

        }
        return dist;
    }
    public static void main(String[] args) {

    }
}
