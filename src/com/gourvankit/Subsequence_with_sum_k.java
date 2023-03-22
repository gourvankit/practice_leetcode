package com.gourvankit;

import java.util.*;
class Test{
    static public int maxProduct(int[] nums) {
        ArrayList<Integer> ls=new ArrayList<>();
        for(int i:nums){
            ls.add(i);
        }
        Collections.sort(ls);
        int res=ls.get(ls.size()-1);
        int max=1;
        int min=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                max=1;
                min=1;
                continue;
            }

            int tmpMax=Math.max(max*nums[i],min*nums[i]);
            int dualTmp=max*nums[i];
            max=Math.max(tmpMax,nums[i]);
            System.out.println("tmpmax");
            System.out.println(tmpMax);
            int tmpMin=Math.min(dualTmp,min*nums[i]);
            min=Math.min(tmpMin,nums[i]);
            System.out.println("tmpmin");
            System.out.println(tmpMin);
            System.out.println("max");
            System.out.println(max);
            System.out.println("min");
            System.out.println(min);
            res=Math.max(res,max);

        }
        return res;
    }
    public static void main(String[] args){
        System.out.println(maxProduct(new int[]{2,3,-2,4}));
//        Scanner sc=new Scanner(System.in);
//        ArrayList<Pair> ls=new ArrayList<>();
//        int n=sc.nextInt();
//        for(int i=0;i<n;i++){
//
//                int f=sc.nextInt();
//                int s=sc.nextInt();
//                ls.add(new Pair(f,s));
//
//        }
//        int count=1;
//        int q=0;
//
//        for(int k=1;k<ls.size();k++){
//            int init=ls.get(q).second;
//            int newInit=ls.get(k).first;
//            if(init>newInit){
//                q++;
//                count++;
//            }
//        }
//        System.out.print("The minimum number of conference rooms required is: ");
//        System.out.print(count);
//        Arrays.asList(new int[]{1,2});

    }
}

//public class Subsequence_with_sum_k {
//    static public int recur(int[] nums,ArrayList<Integer> ls,int target,int index){
//        if(index==nums.length && ls.size()>=1){
//            if((ls.get(0)+ls.get(ls.size()-1))<=target){
//                return 1;
//            }else{
//                return 0;
//            }
//        }
//        ls.add(nums[index]);
//        int x= recur(nums,ls,target, index+1);
//        ls.remove(ls.size()-1);
//        int y= recur(nums,ls,target,index+1);
//        return x+y;
//    }
//    static public void findCombination(int[] nums,int index,int target,List<List<Integer>> myLists,List<Integer>myList){
//
//        if(target==0){
//            myLists.add(new ArrayList<>(myList));
//            return;
//        }
//
//
//        for(int i=index;i<nums.length;i++){
//            if(i>index && nums[i]==nums[i-1]) continue;
//            if(nums[i]>target) break;
//            myList.add(nums[i]);
//            findCombination(nums,i+1,target-nums[i],myLists,myList);
//            myList.remove(myList.size()-1);
//        }
//
//
//    }
//    static public List<List<Integer>> combinationSum2(int[] candidates, int target) {
//        List<List<Integer>> myLists=new ArrayList<>();
//        List<Integer> myList=new ArrayList<>();
//        Arrays.sort(candidates);
//        findCombination(candidates,0,target,myLists,myList);
//        return myLists;
//    }
//    public static void main(String[] args) {
//        ArrayList<Integer> ls=new ArrayList<>();
//        System.out.println((recur(new int[]{3,3,6,8},ls,9,0)));
//        Scanner sc=new Scanner(System.in);
//        int num=sc.nextInt();
//        while(num!=-1){
//            ls.add(num);
//            num=sc.nextInt();
//        }
//    }
//}
//class Test{
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int[] arr=new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//        int n2=sc.nextInt();
//        ArrayList<Integer> ls=new ArrayList<>();
//        for(int i=0;i<n-n2+1;i++){
//            int max=0;
//            for(int j=i;j<n2+i;j++){
//                max=Math.max(max,arr[j]);
//
//            }
//            ls.add(max);
//        }
//        for(int i=0;i<ls.size();i++){
//            System.out.print(ls.get(i)+" ");
//        }
//    }
//}
