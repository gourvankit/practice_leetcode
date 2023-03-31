package com.gourvankit;

import java.util.ArrayList;
import java.util.List;

public class RatInAMaze {

    static void recurr(int i, int j, int a[][], int n, ArrayList < String > ans, String move,
                       int vis[][], int di[], int dj[]) {
        if (i == n - 1 && j == n - 1) {
            ans.add(move);
            return;
        }
        String dir = "DLRU";
        for (int ind = 0; ind < 4; ind++) {
            int nexti = i + di[ind];
            int nextj = j + dj[ind];
            if (nexti >= 0 && nextj >= 0 && nexti < n && nextj < n &&
                    vis[nexti][nextj] == 0 && a[nexti][nextj] == 1) {

                vis[i][j] = 1;
                recurr(nexti, nextj, a, n, ans, move + dir.charAt(ind), vis, di, dj);
                vis[i][j] = 0;

            }
        }
    }
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        ArrayList<String> ls=new ArrayList<>();
        int[][] vis=new int[n][n];
        int[] delrow=new int[]{+1,0,0,-1};
        int[] delcol=new int[]{0,-1,+1,0};
        if(m[0][0]==1) recurr(0, 0, m, n, ls, "", vis, delrow, delcol);
        return ls;
    }

    public static void main(String[] args) {
        String s="abcd";
        String d=s.substring(2,10);
        System.out.println(d);

    }
}
