package com.gourvankit;

import java.util.ArrayList;
import java.util.HashSet;

public class NumberOfDistinctIslands {
    static class Pair{
        int row;
        int col;

        public Pair(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }
    static public void dfs(int r, int c, int[][] grid, int[][] vis, ArrayList<String> myList,int r0,int c0){
        vis[r][c]=1;
        myList.add(toString(r-r0,c-c0));
        int[] delrow=new int[]{-1,0,+1,0};
        int[] delcol=new int[]{0,-1,0,+1};
        for(int i=0;i<4;i++){
            int mrow=r+delrow[i];
            int ncol=c+delcol[i];
            if(mrow>=0 && mrow< grid.length && ncol>=0 && ncol<grid[0].length && vis[mrow][ncol]==0&& grid[mrow][ncol]==1 ){
                dfs(mrow,ncol,grid,vis,myList,r0,c0);
            }

        }
    }
    static public String toString(int r,int c){
        return Integer.toString(r)+" "+Integer.toString(c);
    }
    static public int findIsland(int[][] grid){
        int n=grid.length;
        int m=grid[0].length;
        int[][] vis=new int[n][m];
        HashSet<ArrayList<String>> mySet=new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1 && vis[i][j]==0){
                    ArrayList<String> myList=new ArrayList<>();
                    dfs(i,j,grid,vis,myList,i,j);
                    mySet.add(myList);

                }
            }
        }
        return mySet.size();
    }
    public static void main(String[] args) {

    }
}
