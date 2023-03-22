package com.gourvankit;// You are using Java
import java.util.*;
class Link{
    static class ListNode{
        int val;
        ListNode next;
        ListNode(){};
        ListNode(int val){
            this.val=val;
        }
        ListNode(int val,ListNode next){
            this.val=val;
            this.next=next;
        }
    }
    public static void main(String[] args){
        int n;
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> ls=new ArrayList<>();
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            int num=sc.nextInt();
            ls.add(num);
        }
        ListNode node=new ListNode();
        ListNode head=node;
        for(int i=0;i<n;i++){
            head.next=new ListNode(ls.get(i));
            head=head.next;
        }
        ListNode h3=node;
        while(h3.next!=null){
            System.out.print(h3.next.val+" ");
            h3=h3.next;
        }
        System.out.println();
        if(n%2!=0){
            int mid=(n+1)/2;
            ListNode h1=node;
            int count=0;
            while(count!=mid){
                h1=h1.next;
                count++;
            }
            System.out.println(h1.val);
        }else{
            int mid=n/2;
            ListNode h2=node;
            int c=0;
            while(c!=mid){
                h2=h2.next;
                c++;
            }
            System.out.print(h2.val+" ");
            System.out.print(h2.next.val);

        }

    }
}