import java.util.*;
public class Pattern
{
    public static void main(String args[])
    {
       String s="sdadacaada";
       int k=4;
       String[] sub=s.split("");
       int len=sub.length;
       ArrayList<String> myList=new ArrayList<>();
       for(int i=0;i<len-(k-1);i++){
               if((i+k)>len){
                   int num=(i+k)-len;
                   int fin=(i+k)-num;
                   String s1=s.substring(i,fin);
                   myList.add(s1);
               }else{
                   String s2=s.substring(i,i+k);
                   myList.add(s2);
               }
       }

       int flag=0;
        HashSet<String> mySet=new HashSet<>();
        ListIterator<String> myIterator= myList.listIterator();
       while(myIterator.hasNext()) {
           String val=myIterator.next();
           for(int j=0;j<val.length();j++){
              if(mySet.add(String.valueOf(val.charAt(j)))){
                  mySet.add(String.valueOf(val.charAt(j)));
              }else{
                  flag=1;
                  break;
              }
           }
           mySet.clear();
           if(flag==0){
               System.out.println(val);
           }
           flag=0;
       }
    }
}