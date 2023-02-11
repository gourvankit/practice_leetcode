package com.gourvankit;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class checkBipartite {
    static public boolean bipartiteWithDFS(ArrayList<ArrayList<Integer>> adj,int col,int start,int[] color){
        color[start]=col;
        for(int it:adj.get(start)){
            if(color[it]==-1){
               if(!bipartiteWithDFS(adj, 1 - col, it, color)){
                   return false;
               }
            }
            else if(color[it]==col){
                return false;
            }
        }
        return true;
    }
    static public void isbiPartite(int V,ArrayList<ArrayList<Integer>> adj){
        int[] color=new int[V];
        for(int i=0;i<V;i++){
            color[i]=-1;
        }
        bipartiteWithDFS(adj,0,0,color);

    }
    static public boolean bipartiteWithBFS(ArrayList<ArrayList<Integer>> adj,int start,int[] color){
        Queue<Integer> myQ=new LinkedList<>();
        myQ.add(start);
        color[start]=0;
        while(!myQ.isEmpty()){
            int node=myQ.peek();
            myQ.remove();
            for(int it:adj.get(node)){
                if(color[it]==-1){
                    myQ.add(it);
                    color[it]=1-color[node];
                }
                else if(color[it]==color[node]){
                    return false;
                }
            }
        }
        return true;



    }

    public static void main(String[] args) {

    }
}
