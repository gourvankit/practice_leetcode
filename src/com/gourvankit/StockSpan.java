package com.gourvankit;

import java.util.Arrays;
import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        int[] prices=new int[]{2,5 ,9, 3, 1, 12, 6 ,8, 7};
        Stack<Integer> st=new Stack<>();
        int[] span=new int[prices.length];
        span[0]=1;
        st.push(0);
        for(int i=1;i< prices.length;i++){
            while(!st.isEmpty() && prices[i]>=prices[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                span[i]=i+1;
            }else{
                span[i]=i-st.peek();
            }
            st.push(i);
        }
        System.out.println(Arrays.toString(span));
    }
}
