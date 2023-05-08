package com.gourvankit;

public class FrogJump {
    static int jump(int index,int[] dp,int[] heights){// Memoization technique
        if(index==0) return 0;
        if(dp[index]!=-1) return dp[index];

        int left=jump(index-1,dp,heights)+Math.abs(heights[index]-heights[index-1]);
        int right=Integer.MAX_VALUE;
        if(index>1){
            right=jump(index-2,dp,heights)+Math.abs(heights[index]-heights[index-2]);
        }
        return dp[index]=Math.min(left,right);
    }

    public static int frogJump(int n, int heights[]) {

        int[] dp=new int[n+1];// Tabulation technique
        dp[0]=0;
        for(int i=1;i<n;i++){
            int fs=dp[i-1]+Math.abs(heights[i]-heights[i-1]);
            int ss=Integer.MAX_VALUE;
            if(i>1){
                ss=dp[i-2]+Math.abs(heights[i]-heights[i-2]);
            }
            dp[i]=Math.min(fs,ss);
        }
        return dp[n-1];

    }

    public static void main(String[] args) {

    }
}
