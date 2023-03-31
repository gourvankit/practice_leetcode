package com.gourvankit;

import java.util.ArrayList;
import java.util.List;

public class MaximumSubArray {
    public int maxSubArray(int[] nums) {
        int ans=nums[0];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum>ans){
                ans=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
