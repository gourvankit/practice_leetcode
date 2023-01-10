package com.gourvankit;

public class ReplaceOWithX {
    static public void dfs(int row,int col,char[][] mat,int[][] vis){
        int[] delrow=new int[]{-1,0,+1,0};
        int[] delcol=new int[]{0,+1,0,-1};
        vis[row][col]=1;
        for(int i=0;i<4;i++){
            int r=row+delrow[i];
            int c=col+delcol[i];
            if(r>=0 && r< mat.length && c>=0 && c< mat[0].length && vis[r][c]==0 && mat[r][c]=='O'){
                dfs(r,c,mat,vis);
            }

        }
    }
    static public void fill(char[][] mat){
        int n=mat.length;
        int m=mat[0].length;
        int[][] vis=new int[n][m];
        for(int j=0;j<m;j++){
            if(vis[0][j]==0 && mat[0][j]=='O'){
                dfs(0,j,mat,vis);
            }
            if(vis[n-1][j]==0 && mat[n-1][j]=='O'){
                dfs(n-1,j,mat,vis);
            }
        }
        for(int i=0;i<n;i++){
            if(vis[i][0]==0 && mat[i][0]=='O'){
                dfs(i,0,mat,vis);
            }
            if(vis[i][m-1]==0 && mat[i][m-1]=='O'){
                dfs(i,n-1,mat,vis);
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(vis[i][j]==0 && mat[i][j]=='O'){
                    mat[i][j]='X';
                    vis[i][j]=1;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        char mat[][] = {
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'O', 'X', 'X'},
                {'X', 'X', 'O', 'O'}};
        fill(mat);
    }
}
