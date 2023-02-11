package com.gourvankit;

import java.util.PriorityQueue;

public class PathWithMinEffort {
    static class Tuple{
        int first;
        int second;
        int third;

        public Tuple(int first, int second, int third) {
            this.first = first;
            this.second = second;
            this.third = third;
        }
    }
    public int minimumEffortPath(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[][] dist=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                dist[i][j]=(int)1e9;
            }
        }
        PriorityQueue<Tuple> pq=new PriorityQueue<>((x, y)->x.first-y.first);
        dist[0][0]=0;
        pq.add(new Tuple(0,0,0));
        int dr[]=new int[]{-1,0,+1,0};
        int dc[]=new int[]{0,+1,0,-1};
        while(!pq.isEmpty()){
            int diff=pq.peek().first;
            int row=pq.peek().second;
            int col=pq.peek().third;
            pq.remove();
            if(row==n-1 && col==m-1){// to check after popping the element from the Queue
                return diff;
            }
            for(int i=0;i<4;i++){
                int mrow=row+dr[i];
                int mcol=col+dc[i];

                if(mrow>=0 && mrow<n && mcol>=0 && mcol<m){
                    int tofind=Math.max(Math.abs(grid[mrow][mcol]-grid[row][col]),diff);
                    if(tofind<dist[mrow][mcol]){
                        dist[mrow][mcol]=tofind;
                        pq.add(new Tuple(tofind,mrow,mcol) );
                    }
                }
            }
        }
        return 0;

    }
    public static void main(String[] args) {

    }
}
