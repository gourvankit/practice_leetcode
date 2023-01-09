package com.gourvankit;

public class LongestPalindrome {
    public static void main(String[] args) {
        String s="babad";
        String ans="";
        int len=0;
        for(int i=0;i<s.length();i++){
            int lefttPivot=i;
            int rightPivot=i;
            while(lefttPivot>=0 && rightPivot<s.length()-1 && s.charAt(lefttPivot)==s.charAt(rightPivot)){
                if(rightPivot-lefttPivot+1>len){
                    ans=s.substring(lefttPivot,rightPivot+1);
                    len=rightPivot-lefttPivot+1;
                }
                lefttPivot--;
                rightPivot++;
            }
            // Case for checking if the palindrome is even
            lefttPivot=i;
            rightPivot=i+1;
            while(lefttPivot>=0 && rightPivot<=s.length()-1 && s.charAt(lefttPivot)==s.charAt(rightPivot)){
                if((rightPivot-lefttPivot+1)>len){
                    ans=s.substring(lefttPivot,rightPivot+1);
                    len=rightPivot-lefttPivot+1;
                }
                lefttPivot--;
                rightPivot++;
            }

        }
        System.out.println(ans);
    }
}
