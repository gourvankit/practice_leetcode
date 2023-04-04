package com.gourvankit;

public class NextPermutation {
    static void swap(int[] nums,int ind1,int ind2){
        int temp=nums[ind1];
        nums[ind1]=nums[ind2];
        nums[ind2]=temp;
    }
    static void reverse(int[] nums,int first,int last){
        int j=nums.length-1;
        while(first<=last){
            int temp=nums[first];
            nums[first]=nums[last];
            nums[last]=temp;
            first++;
            last--;
        }
    }
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length <= 1) return;

        int i = nums.length-2;
        while(i >=0 && nums[i]>=nums[i+1])
            i--;

        if(i>=0){
            int j = nums.length-1;
            while(nums[j] <= nums[i]){
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i+1, nums.length-1);


    }

    public static void main(String[] args) {
    }
}
