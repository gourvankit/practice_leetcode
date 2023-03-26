package com.gourvankit;

import java.util.ArrayList;

public class SplitAndUpperCase {

    public static void main(String[] args) {
       String st="ThisIsAnAutomationEra";
        ArrayList<String > ls=new ArrayList<>();
        int index=0;
        for(int i=1;i<st.length();i++){
            if(st.charAt(i)>=65 && st.charAt(i)<=90){
                String ans= st.substring(index,i);
                ls.add(ans);
                index=i;
            }
        }
        ls.add(st.substring(index));

        for (String l : ls) {
            String s = "";
            char c = (char) (97 + l.charAt(0) - 'A');
            s += c;
            s += l.substring(1);
            System.out.print(s+" ");
        }
//        System.out.println(ls);
    }
}
