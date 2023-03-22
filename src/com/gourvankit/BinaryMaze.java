package com.gourvankit;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class BinaryMaze {
    static class tuple {
        int first, second, third;
        tuple(int _first, int _second, int _third) {
            this.first = _first;
            this.second = _second;
            this.third = _third;
        }
    }

    static int shortestPath(int[][] grid, int[] source, int[] destination) {

        // Your code here
        if(source[0] == destination[0] &&
                source[1] == destination[1]) return 0;
        Queue<tuple> q = new LinkedList<>();
        int n = grid.length;
        int m = grid[0].length;


        int[][] dist = new int[n][m];
        for(int i = 0;i<n;i++) {
            for(int j =0;j<m;j++) {
                dist[i][j] = (int)(1e9);
            }
        }
        dist[source[0]][source[1]] = 0;
        q.add(new tuple(0, source[0], source[1]));

        int dr[] = {-1, 0, 1, 0};
        int dc[] = {0, 1, 0, -1};

        while(!q.isEmpty()) {
            tuple it = q.peek();
            q.remove();
            int dis = it.first;
            int r = it.second;
            int c = it.third;
            for(int i = 0;i<4;i++) {
                int newr = r + dr[i];
                int newc = c + dc[i];
                if(newr >= 0 && newr < n && newc >= 0 && newc < m
                        && grid[newr][newc] == 1 && dis + 1 < dist[newr][newc]) {
                    dist[newr][newc] = 1 + dis;
                    if(newr == destination[0] &&
                            newc == destination[1]) return dis + 1;
                    q.add(new tuple(1+dis, newr, newc));
                }
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        System.out.println(shortestPath(new int[][]{{1,1,1,1},{1,1,0,1},{1,1,1,1},{1,1,0,0},{1,0,0,1},},new int[]{0,1},new int[]{2,2}));
    }
}
