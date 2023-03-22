package com.gourvankit;

import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.MonthDay;
import java.time.temporal.ChronoField;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Strings1 {
    //    public static int doUnion(int a[], int n, int b[], int m)
//    {
//        //Your code here
//        HashSet<Integer> myHash=new HashSet<>();
//        for(int i=0;i<n;i++){
//            myHash.add(a[i]);
//        }
//        for(int i=0;i<m;i++){
//            myHash.add(b[i]);
//        }
//        return myHash.size();
//
//
//    }
//public static void multiplyStrings(String s1,String s2)
//{
//    //code here.
//   String[] firstNum=s1.split("");
//   String[] secondNum=s2.split("");
//    ArrayList<Integer> answer=new ArrayList<>();
//    int carry=0;
//    if(firstNum.length>secondNum.length){
//        for(int i=(secondNum.length)-1;i>=0;i--){
//            for(int j=(firstNum.length)-1;j>=0;j--){
//                int result=carry+Integer.parseInt(firstNum[j])*Integer.parseInt(secondNum[i]);
//                if(result>=10){
//                    carry+=result/10;
//                    result=result%10;
//                    answer.add(result);
//                }else{
//                    answer.add(result);
//                }
//            }
//        }
//        System.out.println(answer.size());
//    }
//
//
//}
//    public static void large(int[] arr,int n){
//        HashSet<Integer> myHash=new HashSet<>();
//       ArrayList<Integer> myList=new ArrayList<>();
//       Arrays.sort(arr);
//        for(int i=0;i<n;i++){
//            if(myHash.contains(arr[i])){
//                continue;
//            }else {
//                myList.add(arr[i]);
//                myHash.add(arr[i]);
//            }
//
//        }
//        int len=myList.size();
//        System.out.println(myList.get(len-2));
//
//    }
//    public static void sum(int n){
//        long sum = 0;
//        for (int x = 1; x <= n; x++)
//            sum = sum + (long) x;
//        System.out.println(sum);
//
//    }
    // Main driver method
//public static void merge(long arr1[], long arr2[], int n, int m)
//{
//   int i=0;
//   int j=0;
//   int c=0;
//   int k=n-1;
//   while(i<=k && j<m){
//       if(arr1[i]>arr2[j]){
//           int temp= (int) arr2[j];
//           arr2[j]=arr1[k];
//           arr1[k]=temp;
//           j++;
//           k--;
//
//       }else{
//           i++;
//       }
//   }
//    Arrays.sort(arr1);
//    Arrays.sort(arr2);
//    System.out.println(Arrays.toString(arr1));
//    System.out.println(Arrays.toString(arr2));
//}
//public static void multiplyStrings(String num1,String num2)//1  2
//{
//    int m = num1.length(), n = num2.length();
//    int flag=0;
//    if(num1.charAt(0)=='0' || num2.charAt(0)=='0'){
//        System.out.println("0");
//    }
//    if(num1.charAt(0)=='-' && num2.charAt(0)=='-'){
//        m--;
//        n--;
//        num1=num1.substring(1);
//        num2=num2.substring(1);
//
//    }
//    else if(num1.charAt(0)=='-'){
//        m--;
//        num1=num1.substring(1);
//        flag=1;
//    }else if(num2.charAt(0)=='-'){
//        n--;
//        num2=num2.substring(1);
//        flag=1;
//    }
//
//    int[] pos = new int[m + n];
//    for(int i = m - 1; i >= 0; i--) {//1
//        for(int j = n - 1; j >= 0; j--) {//0
//            int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
//            int p1 = i + j, p2 = i + j + 1;// 1 // 2
//            int sum = mul + pos[p2];
//            pos[p1] += sum / 10;
//            pos[p2] = (sum) % 10;
//        }
//    }
//
//    String result="";
//    for(int i=0;i< pos.length;i++){
//        result+=pos[i];
//    }
//    if(pos[0]==0){
//        result=result.substring(1);
//    }
////    result=result.substring(1);
//    if(flag==1){
//        System.out.println("-"+result);
//    }else{
//        System.out.println(result);
//    }
////    System.out.println(Arrays.toString(pos));
//
//}
//    /public static void swapAlternate(int[] arr,int n,int K){
//        HashMap<Integer,Integer> myMap=new HashMap<>();
//        for(int i=0;i<arr.length;i++){
//            if(myMap.containsKey(arr[i])){
//                myMap.put(arr[i],myMap.get(arr[i])+1);
//            }else{
//                myMap.put(arr[i],1);
//            }
//        }
//        HashSet<Integer> mySet=new HashSet<>(myMap.values());
//        if(mySet.size()== myMap.size()){
//            return true;
//        }
//        return false;
//    }
//        public static void findTriplets(int[] A, int n, int K)  {
//
//            // Write your code here.
//            Arrays.sort(A);
//            ArrayList<List<Integer>> answer = new ArrayList<List<Integer>>();
//            for (int i = 0; i < n; i++) {
//                int j = i + 1;
//                int k = n - 1;
//                if(i > 0 && A[i] == A[i - 1]) {
//                    continue;
//                }
//                while (j < k) {
//                    if(k < (n - 1) && A[k] == A[k + 1]) {
//                        k--;
//                        continue;
//                    }
//                    if(A[i] + A[j] + A[k] > K) {
//                        k--;
//                    } else if(A[i] + A[j] + A[k] < K) {
//                        j++;
//                    } else {
//                        ArrayList<Integer> triples = new ArrayList<Integer>();
//                        triples.add(A[i]);
//                        triples.add(A[j]);
//                        triples.add(A[k]);
//                        Collections.sort(triples);
//                        j++;
//                        k--;
//                        answer.add(triples);
//                    }
//                }
//            }
//            System.out.println(answer);
//        }
//    public static void sortArray(int[] arr){
//        //5
//        HashMap<Integer,Integer> myMap=new HashMap<>();
//        for(int k=0;k<arr.length;k++){
//            if(myMap.containsKey(arr[k])){
//                myMap.put(arr[k],myMap.get(arr[k])+1);
//            }else{
//                myMap.put(arr[k],1);
//            }
//        }
//        int i=0;
//        int cnt0=0;
//        int cnt1=0;
//        int cnt2 = 0;
//        if(myMap.containsKey(0)){
//            cnt0=myMap.get(0);
//        }
//        if(myMap.containsKey(1)){
//            cnt1=myMap.get(1);
//        }
//        if(myMap.containsKey(2)){
//            cnt2=myMap.get(2);
//        }
//        while(cnt0>0){
//            arr[i]=0;
//            i++;
//            cnt0--;
//        }
//        while(cnt1>0){
//            arr[i]=1;
//            i++;
//            cnt1--;
//        }while(cnt2>0){
//            arr[i]=2;
//            i++;
//            cnt2--;
//        }
//        System.out.println(Arrays.toString(arr));
//        for(int i=0;i<arr.length-1;i++){//0
//            for(int j=i+1;j<arr.length;j++){//6
//                if(arr[i]>arr[j]){
//                    int temp=arr[i];
//                    arr[i]=arr[j];
//                    arr[j]=temp;
//                }else if(arr[i]==arr[j]){
//                    int temp=arr[i+1];
//                    arr[i+1]=arr[j];
//                    arr[j]=temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//    }
//    public static long factorial(int n){
//        if(n==0){
//            return 1;
//        }else{
//            return n*factorial(n-1);
//        }
//    }
//public static void sumOrProduct() {
//
//    // Write your code here
////    List<Integer> myList=new LinkedList<>();
////    List<Integer> myList2=new LinkedList<>();
////
////        myList.add(1);
////        myList.add(2);
////        myList.add(3);
////    myList2.add(4);
////    myList2.add(5);
////    myList2.add(6);
////    int i=0;
////    int l1=myList.size();
////    int l2=myList2.size();
////    while(l1>0 && l2>0){
////        System.out.println(myList.get(i)+myList2.get(i));
////        i++;
////        l1--;
////        l2--;
////    }
//
//
//
//}
//public static void findArrayIntersection(int[] nums1,int[] nums2)
//{
//    // Write Your Code Here.
//    ArrayList<Integer> myList=new ArrayList<>();
//    HashMap<Integer,Boolean> myMap=new HashMap<>();
//    for(int i=0;i<nums1.length;i++){
//        myMap.put(nums1[i],false);
//    }
//    for(int i=0;i<nums2.length;i++){
//
//        if(myMap.containsKey(nums2[i]) && !myMap.get(nums2[i])){
//            myList.add(nums2[i]);
//            myMap.put(nums2[i],true);
//        }
//    }
//    int[] result=new int[myList.size()];
//    for(int i=0;i<myList.size();i++){
//        result[i]=myList.get(i);
//    }
//    System.out.println(Arrays.toString(result));
//}
//    System.out.println(myMap2);
//    int i=0;
//    int j=0;
//    while(i<n || j<m){
//        if(myMap.get(arr1.get(i))==myMap2.get(arr2.get(j))){
//            myList.add(arr1.get(i));
//        }
//        i++;
//        j++;
//    }
//    System.out.println(myList);
//public static ArrayList<Integer> findArrayIntersection(ArrayList<Integer> arr1, int n, ArrayList<Integer> arr2, int m)
//{
//    // Write Your Code Here.
//    ArrayList<Integer> myList=new ArrayList<>();
//    ArrayList<Integer> result=new ArrayList<>();
//    for(int i=0;i<n;i++){
//        myList.add(arr1.get(i));
//    }
//    for(int j=0;j<m;j++){
//        if(myList.contains(arr2.get(j))){
//            result.add(arr2.get(j));
//            int index=myList.indexOf(arr2.get(j));
//            myList.remove(index);
//        }
//    }
//    return result;
//}
//    public static void sorting(){
//        int[] arr=new int[]{0,1,0,1,1};
//        int l=0;
//        int r=arr.length-1;
//        while(l<r){
//            if(arr[l]==1 && l<r){
//                int temp=arr[r];
//                arr[r]=arr[l];
//                arr[l]=temp;
//                r--;
//            }else{
//                l++;
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//    }
//    public static String finSub(String s,int l,int r){
//        HashMap map=new HashMap<>();
//        if(l==r){
//            return s;
//        }
//        while(l<r){
//            for(int i=0;i<=r;i++){
//                finSub(s,i,r);
//            }
//        }
//
//    }
//
//    public static void divide(int dividend, int divisor) {
//        int flag=1;
//        if(dividend<0){
//            flag=-1;
//            dividend=flag*dividend;
//        }
//        if(divisor<0){
//            flag=-1;
//            divisor=flag*divisor;
//        }
//        if(dividend<0 && divisor<0){
//            flag=1;
//            dividend=-1*dividend;
//            divisor=-1*divisor;
//        }
//        if(divisor==1){
//            System.out.println( dividend);
//        }
//
//
//        int counter=0;
//        int num=divisor;
//        while(divisor<=dividend){
//            counter++;
//            divisor=divisor+num;
//        }
//        System.out.println(flag*counter);


//    }
//public static long sumOrProduct(int n, int q) {
//
//    // Write your code here
//    int num= (int) (1e9+7);
//    if(q==1){
//        long sum=0;
//        for(int i=1;i<=n;i++){
//            sum+=i;
//        }
//        return sum;
//    }
//    if(q==2){
//        long mul=1;
//        for(int i=1;i<=n;i++){
//            mul=mul*i;
//            mul=mul%num;
//        }
//        return mul%num;
//    }
//    return -1;
//}
//    public static int change(String s){
//        int finalValue=0;
//        int[] arr=new int[]{1,4,5,9,10,40,50,90,100,400,500,900,1000};
//        String[] roman=new String[]{"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
//        String[] givenArr=s.split("");
//        for(int j=0;j<givenArr.length;j++){
//            for(int i=0;i<roman.length;i++){
//                if(Objects.equals(givenArr[j], roman[i])){
//                    finalValue+=arr[i];
//                }
//            }
//        }
//        return finalValue;
//    }

    static public void compress(char[] chars) {
        int n = chars.length;

        int i = 0, j = 0;
        while (i < n) {
            int count = 1;
            while (i < n - 1 && chars[i] == chars[i + 1]) {
                count++;
                i++;
            }

            chars[j++] = chars[i++];
            if (count > 1) {
                String countStr = String.valueOf(count);
                for (int k = 0; k < countStr.length(); k++) {
                    chars[j++] = countStr.charAt(k);
                }
            }
        }
        System.out.println(chars);
    }
    public static void main(String args[])
        {
            compress(new char[]{'a','a','b','b'});

//            ArrayList<Integer> myListnew ArrayList<>();
//            myList.add(3);
//            myList.add(2);
//            myList.add(1);
//            myList.add(1,6);
//            System.out.println(myList);sou
//            Object[] myrr=myList.toArray();
//           int[] arr= new int[]{1,3,5,4,6};
//           int start=0;
//           int last=arr.length-1;
//           while(!(start>=last) ){
//               int temp=arr[last];
//               arr[last]=arr[start];
//               arr[start]=temp;
//               start++;
//               last--;
//           }
//           ArrayList<Integer> myList=new ArrayList<>();
//           myList.
//            System.out.println(Arrays.toString(arr));


//            Pattern p = Pattern.compile(".s");
//            Matcher m = p.matcher("as");
//            boolean b = m.find();
//            boolean b2=Pattern.compile(".s").matcher("as").matches();
//            boolean b3 = Pattern.matches(".s", "as");
//            System.out.println(b+" "+b2+" "+b3);
//            StringBuilder sb=new StringBuilder("hello");
//            sb.replace(2,3,"ds");
//            System.out.println(sb);
//            StringTokenizer st=new StringTokenizer("hello, world",",",true);
//            while(st.hasMoreElements()){
//                System.out.println(st.nextToken());
//            }
//            String s="chef";
//            char[] arr=s.toCharArray();
//            for(int i=0;i<arr.length-1;i+=2){
//                char temp=arr[i];
//                arr[i]=arr[i+1];
//                arr[i+1]=temp;
//            }
//            System.out.println(arr);
//            String x="";
//            for(int i=0;i<arr.length;i++){
//                int num=122-(arr[i]-97);
//                char ch= (char) num;
//                x+=ch;
//            }
//            System.out.println(x);

//            for(int i=0;i<6;i++){
//                for(int k=6;k>i;k--){
//                    System.out.print(" ");
//                }
//                for(int j=0;j<(2*i)+1;j++){
//                    System.out.print("*");
//                }
//                System.out.println();
//            }

//            int i, j;
//            for(i=0; i<5; i++) //outer loop for number of rows(n) { for(j=2*(n-i); j>=0; j--) // inner loop for spaces
//            {
//                System.out.print(" "); // printing space
//            }
//            for(j=0; j<=i; j++) //  inner loop for columns
//            {
//                System.out.print("* "); // print star
//            }
//            System.out.println(); // ending line after each row
//            String s2=Arrays.toString(arr);
//            for(int i=0;i<arr.length;i++){
//
//            }
//Pattern pattern=Pattern.compile("\\D");
//Matcher matcher=pattern.matcher("7883");
//            int x=5;d

//            int y=12;
//            int diff=(x-y);
//            if(diff<0){
//                diff=Math.abs(diff);
//                xqx=x+(diff);
//                y=y-diff;
//            }else{
//                x=x-diff;
//                y=y+diff;
//            }
//            System.out.println(x);
//            System.out.println(y);
//            findArrayIntersection(new int[]{4,9,5},new int[]{9,4,9,8,4});
//            sumOrProduct();
//            ArrayList<Integer> my=new ArrayList<>();
//            my.add(2);
//            my.add(3);
//            int mul=1;
//            for(int i=1;i<=15;i++){
//                mul=mul*i;
//            }
//            System.out.println(mul);

//            System.out.println(sumOrProduct(15,2));

//           sortArray(new int[]{0 ,1, 1, 0, 0, 1, 1, 0, 1, 0});
//            swapAlternate(new int[]{10,5,5,5,2},5,12);
//            multiplyStrings("99","9");
//            merge(new long[]{1,35},new long[]{6,9,13,15,20,25,29,46},2,8);
//            String s="aaaaa";
//            int k=2;
//            String[] ArrayString=s.split("");//3
//            HashSet<String> mySet=new HashSet<>();
//            ArrayList<String> myList=new ArrayList<>();
//            int len=ArrayString.length;
//            for(int i=0;i<len;i++){
//                if(!(mySet.contains(ArrayString[i]))){
//                    continue;
//                }else{
//                    mySet.add(ArrayString[i]);
//                    myList.add(ArrayString[i]);
//
//                }
//            }
//
//            int len2= myList.size();
//
//            for(int i=0;i<len-2;i++){
//                if((i+k)>len){
//                    int num=(i+k)-len;
//                    int fin=(i+k)-num;
//                    System.out.println(s.substring(i,fin));
//                }else{
//                    System.out.println(s.substring(i,i+k));
//                }
//            }

        }
    }
