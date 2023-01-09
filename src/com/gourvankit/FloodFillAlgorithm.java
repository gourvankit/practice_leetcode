package com.gourvankit;

public class FloodFillAlgorithm {
    static public void dfs(int row,int col,
                           int toColor,int[][] vis,int[][] grid,int[][] ans,
                           int[] delRow,int[] delCol,int iniColor
    ){
        ans[row][col]=toColor;
        vis[row][col]=1;
        for(int i=0;i<4;i++){
            int mrow=row+delRow[i];
            int ncol=col+delCol[i];
            if(mrow>=0 && mrow< ans.length && ncol>=0 && ncol< ans.length && grid[mrow][ncol]==iniColor && vis[mrow][ncol]==0){
                dfs(mrow,ncol,toColor,vis,grid,ans,delRow,delCol,iniColor);
            }
        }



    }
    public static void main(String[] args) {
        int[] delRow=new int[]{-1,0,+1,0};
        int[] delCol=new int[]{0,+1,0,-1};
    }
}
