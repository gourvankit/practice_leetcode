package com.gourvankit;

public class UniquePaths {
    static int unique(int m,int n,int row,int col,int[][] dp){
        if(row==m-1 && col==n-1) return 1;
        if(row>=m || col>=n ) return 0;
        if(dp[row][col]!=-1) return dp[row][col];
        return dp[row][col]=unique(m,n,row+1,col,dp)+unique(m,n,row,col+1,dp);
    }
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        return unique(m,n,0,0,dp);
    }

    public static void main(String[] args) {

    }
}
