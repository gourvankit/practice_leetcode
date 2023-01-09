package com.gourvankit;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {
    static class Pair{
        int row;
        int col;
        int tm;

        public Pair(int row, int col, int tm) {
            this.row = row;
            this.col = col;
            this.tm = tm;
        }
    }
    static public int rotten(int[][] grid){
        int n=grid.length;
        int m=grid[0].length;
        Queue<Pair> myQueue=new LinkedList<>();
        int[][] vis=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    myQueue.add(new Pair(i,j,0));
                    vis[i][j]=2;
                }
                else {
                    vis[i][j]=0;
                }
            }
        }
        int[] delRow=new int[]{-1,0,+1,0};
        int[] delCol=new int[]{0,+1,0,-1};
        int t=0;
        while(!myQueue.isEmpty()){
            int mr=myQueue.peek().row;
            int nc=myQueue.peek().col;
            int tm=myQueue.peek().tm;
            t=Math.max(t,tm);
            myQueue.remove();

            for(int i=0;i<4;i++){
                int mrow=mr+delRow[i];
                int ncol=nc+delCol[i];
                if(mrow>=0 && mrow<n && ncol>0 && ncol<m && vis[mrow][ncol]==0 &&
                        grid[mrow][ncol]==2
                ){
                    myQueue.add(new Pair(mrow,ncol,tm+1));
                    vis[mrow][ncol]=2;
                }
            }


        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(vis[i][j]!=2 && grid[i][j]==1){
                    return -1;
                }
            }
        }
        return t;
    }
    public static void main(String[] args) {
        int[][] grid =  {{0,1,2},{0,1,2},{2,1,1}};
        System.out.println(rotten(grid));
    }
}
