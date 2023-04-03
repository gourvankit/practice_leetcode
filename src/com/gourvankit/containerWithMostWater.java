package com.gourvankit;

public class containerWithMostWater {
    static int maxAreaBrute(int[] height) {
        int area=0;
        for(int i=0;i<height.length;i++){
            for(int j=i+1;j<height.length;j++){
                int toMul=Math.min(height[i],height[j]);
                area=Math.max(area,toMul*(j-i));
            }
        }
        return area;
    }
    static int maxAreaOptimal(int[] height){
        int area=0;
        int lp=0;
        int rp=height.length-1;
        while(lp<=rp){
            int min=Math.min(height[lp],height[rp]);
            area=Math.max(area,(rp-lp)*min);
            if(height[lp]<height[rp]){
                lp++;
            }else{
                rp--;
            }
        }
        return area;
    }

    public static void main(String[] args) {
        System.out.println(maxAreaOptimal(new int[]{1,8,6,2,5,4,8,3,7}));
    }
}
