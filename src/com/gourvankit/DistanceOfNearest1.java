package com.gourvankit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class DistanceOfNearest1 {
    static class Pair{
        int first;
        int second;
        int third;

        public Pair(int first, int second, int third) {
            this.first = first;
            this.second = second;
            this.third = third;
        }
    }
    static public int[][] nearestDistance(int[][] grid){
        int n=grid.length;
        int m=grid[0].length;
        int[][] distance=new int[n][m];
        int[][] vis=new int[n][m];
        Queue<Pair> myQ=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    myQ.add(new Pair(i,j,0));
                    vis[i][j]=1;
                }else{
                    vis[i][j]=0;
                }
            }
        }
        int[] delrow=new int[]{-1,0,+1,0};
        int[] delcol=new int[]{0,+1,0,-1};
        while(!myQ.isEmpty()){
            int row=myQ.peek().first;
            int col=myQ.peek().second;
            int dist=myQ.peek().third;
            myQ.remove();
            distance[row][col]=dist;
            for(int i=0;i<4;i++){
                int mrow=row+delrow[i];
                int ncol=col+delcol[i];
                if(mrow>=0 && mrow<n && ncol>=0 && ncol<m && vis[mrow][ncol]==0){
                    myQ.add(new Pair(mrow,ncol,dist+1));
                    vis[mrow][ncol]=1;
                }

            }
        }
        return distance;

    }
    public static void main(String[] args) {
        int[][] grid = {
                {0,1,1,0},
                {1,1,0,0},
                {0,0,1,1}
        };
        ArrayList<Character> ls=new ArrayList<>();
        int[][] ans=nearestDistance(grid);
        for(int i = 0; i < ans.length; i++){
            for(int j = 0; j < ans[i].length; j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
