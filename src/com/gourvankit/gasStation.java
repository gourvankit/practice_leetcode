package com.gourvankit;

public class gasStation {
    static public int calculate(int[] gas, int[] cost){

        int start = 0;
        int sum = 0;
        for(int i=0;i<gas.length;i++){
            start+=gas[i];
            sum+=cost[i];
        }
        if(start<sum) return -1;
        start=0;
        sum=0;
        for (int i = 0; i < gas.length * 2; i++) {
            sum += gas[i % gas.length] - cost[i % gas.length];
            if (sum < 0) {
                start = i + 1;
                sum = 0;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        System.out.println(calculate(new int[]{2,3,4},new int[]{3,4,3}));

    }
}
