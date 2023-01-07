package com.gourvankit;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIslands {
    public static class Pair{
        int first;
        int second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
    static public void bfs(int row,int col,char[][] grid,int[][] vis){
        vis[row][col]=1;
        Queue<Pair> myQueue=new LinkedList<>();
        myQueue.add(new Pair(row,col));
        int n=grid.length;
        int m=grid[0].length;
        while(!myQueue.isEmpty()){
            int mrow=myQueue.peek().first;
            int mcol=myQueue.peek().second;
            myQueue.remove();
            for(int delrow=-1;delrow<=1;delrow++){
                for(int delcol=-1;delcol<=1;delcol++){
                    int rToCheck=mrow+delrow;
                    int cToCheck=mcol+delcol;
                    if(rToCheck>=0 && rToCheck<n && cToCheck>=0 && cToCheck<m && vis[rToCheck][cToCheck]==0 && grid[rToCheck][cToCheck]=='1'){
                        vis[rToCheck][cToCheck]=1;
                        myQueue.add(new Pair(rToCheck,cToCheck));
                    }

                }
            }
        }
    }
    static public int numberOfIslands(char[][] grid){
        int n=grid.length;
        int m=grid[0].length;
        int cnt=0;
        int[][] vis=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(vis[i][j]==0 && grid[i][j]=='1'){
                    cnt++;
                    bfs(i,j,grid,vis);
                }
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        System.out.println(numberOfIslands(new char[][]{{'0','0'},{'1','1'}}));
    }
}
