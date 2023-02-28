package com.gourvankit;

import java.util.Arrays;

public class BestTimeToBuyAndSellStocks {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int lptr=0;
        int rptr=1;
        for(int i=0;i<prices.length-1;i++) {
            if(prices[rptr]>prices[lptr]){
                int pf=prices[rptr]-prices[lptr];
                if(pf>maxProfit){
                    maxProfit=pf;
                }

            }else{
                lptr=rptr;
            }
            rptr++;
        }
        return maxProfit;
    }

    public static void main(String[] args) {



    }
}

