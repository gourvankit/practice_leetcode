package com.gourvankit;

import java.util.*;

public class WordLadder {
    static class Pair{
        String first;
        int second;
        public Pair(String first,int second){
            this.first=first;
            this.second=second;
        }
    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<Pair> q=new LinkedList<Pair>();
        q.add(new Pair(beginWord,1));
        Set<String> s=new HashSet<>();
        for(int i=0;i<wordList.size();i++){
            s.add(wordList.get(i));
        }
        while(!q.isEmpty()){

            String word=q.peek().first;
            int dist=q.peek().second;
            q.remove();
            if(word.equals(endWord)){
                return dist;
            }
            for(int i=0;i<word.length();i++){
                for(char ch='a';ch<='z';ch++){
                    char[] original=word.toCharArray();
                    original[i]=ch;
                    String newWord=new String(original);
                    if(s.contains(newWord)){
                        q.add(new Pair(newWord,dist+1));
                        s.remove(newWord);
                    }
                }

            }

        }
        return 0;
    }
}
