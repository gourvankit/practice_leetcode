package com.gourvankit;

import java.util.Arrays;

public class LongestIncreasingSubSeq {
    public int lengthOfLIS(int[] nums) {
        int[] dp=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            dp[i]=1;
        }
        for(int i=nums.length;i>=0;i--){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]<nums[j]){
                    dp[i]=Math.max(dp[i],1+dp[j]);
                }
            }
        }
        Arrays.sort(dp);
        return dp[nums.length-1];
    }

    public static void main(String[] args) {

    }
}
