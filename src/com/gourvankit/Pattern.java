package com.gourvankit;

import java.util.ArrayList;
import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
////        int j;
////        for (int i = 1; i <= 5; i++) {
////            for (j = i; j < 5; j++) {
////                System.out.print(" ");
////            }
////            for (int k = 1; k <= (2 * i - 1); k++) {
////                if (k == 1 || k == (2 * i - 1)) {
////                    System.out.print("*");
////                } else {
////                    System.out.print(" ");
////                }
////            }
////            System.out.println("");
////        }
////        for (j = 5; j >= 0; j--){
////            for(int k=j;k<5;k++){
////                System.out.print(" ");
////            }
////            for(int i=1;i<=(2*j-1);i++){
////                if(i==1 || i==2*j-1){
////                    System.out.print("1");
////                }else{
////                    System.out.print(" ");
////                }
////            }
////            System.out.println("");
////        }
//        int j;
//        for (int i = 1; i <= 5; i++) {
//            for (int k = 1; k <= (2 * i - 1); k++) {
//                if (k == 1 || k == (2 * i - 1)) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println("");
//        }
//        int num=5;
//        for(j=5;j>=0;j--){
//
//            for(int i=j;i<=(2*j-1);i++){
//                if(i==j || i==(2*j-1)){
//                    System.out.print(num+" ");
//                }else{
//                    System.out.print("  ");
//                }
//            }
//            num--;
//            System.out.println();
//        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter 0's or 1's in the array:");
        for(int i=0;i<n;i++)arr[i]=sc.nextInt();
        ArrayList<Integer> ls=new ArrayList<>();
        int sum=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                sum+=arr[i];
            }
            else
            {
                ls.add(sum);
                sum=0;
            }
        }
        ls.add(sum);
        sum=0;
        System.out.println(ls);
        for(int i=0;i<ls.size()-1;i++)
        {
            if(ls.get(i)+ls.get(i+1) > sum)
            {
                sum=ls.get(i)+ls.get(i+1);
            }
        }
        System.out.println("Maximum 1's after replacing one 0 with 1 are: "+ (sum+1));
    }
}
