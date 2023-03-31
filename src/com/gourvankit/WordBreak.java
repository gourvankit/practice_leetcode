package com.gourvankit;

import java.util.ArrayList;
import java.util.List;

public class WordBreak {
    static public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp=new boolean[s.length()+1];
        dp[s.length()]=true;
        for(int i=s.length()-1;i>=0;i--){
            for(String w:wordDict){
                if(i+w.length()<=s.length() && s.substring(i, i + w.length()).equals(w)) {
                    dp[i]=dp[i+w.length()];
                    System.out.println("jel");
                }
                if(dp[i]) break;
            }
        }
        return dp[0];

    }

    public static void main(String[] args) {
        List<String> ls=new ArrayList<>();
        ls.add("leet");
        ls.add("code");
        System.out.println(wordBreak("leetcode",ls));
    }
}
