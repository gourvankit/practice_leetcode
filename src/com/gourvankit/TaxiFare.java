package com.gourvankit;

import java.util.*;

public class TaxiFare {
    // You are using Java
        static class Pair{
            int f;
            int s;
            public Pair(int f,int s){
                this.f=f;
                this.s=s;
            }
        }
        public static void main(String[] args){
//            Scanner sc=new Scanner(System.in);
//            int n=sc.nextInt();
//            int[][] arr=new int[n][n];
//            for(int i=0;i<n;i++){
//                for(int j=0;j<n;j++){
//                    arr[i][j]=sc.nextInt();
//                }
//            }
            int n=3;
            int[][] arr=new int[][]{
                    {1,2,3},
                    {2,1,4},
                    {3,4,3}};
            ArrayList<Integer> ls=new ArrayList<>();
            Queue<Pair> q=new LinkedList<>();
            q.add(new Pair(0,0));
            int[] delrow=new int[]{0,+1};
            int[] delcol=new int[]{+1,0};
            while(!q.isEmpty()){
                int row=q.peek().f;
                int col=q.peek().s;
                ls.add(arr[row][col]);
                q.remove();
                ArrayList<Integer> ch=new ArrayList<>();
                for(int i=0;i<2;i++){
                    int mrow=row+delrow[i];
                    int ncol=col+delcol[i];
                    if(mrow>=0 && mrow<n && ncol>=0
                            && ncol<n &&(arr[mrow][ncol]-arr[row][col]==1 || arr[mrow][ncol]-arr[row][col]==-1)
                    && !ch.contains(Math.abs(arr[mrow][ncol]-arr[row][col]))
                 ){
                        q.add(new Pair(mrow,ncol));
                        ch.add(Math.abs(arr[mrow][ncol]-arr[row][col]));
                    }
                }
            }
            System.out.println(ls);
        }

    }
