package com.gourvankit;

import java.util.*;

public class WordLadderII {
    static public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        Queue<List<String>> q=new LinkedList<>();
        HashSet<String> hs=new HashSet<>();
        for(int i=0;i<wordList.size();i++){
            hs.add(wordList.get(i));
        }
        List<String> ls=new ArrayList<>();
        ls.add(beginWord);
        q.add(ls);
        List<String> usedOnLevel=new ArrayList<>();
        usedOnLevel.add(beginWord);
        int level=0;
        List<List<String>> ans=new ArrayList<>();
        while(!q.isEmpty()){
            List<String> vec=q.peek();
            q.remove();
            if(vec.size()>level){
                level++;
                for (String it: usedOnLevel) {
                    hs.remove(it);
                }
            }
            String word=vec.get(vec.size()-1);
            if(word.equals(endWord)){
                if(ans.size()==0){
                    ans.add(vec);
                }
                else if(ans.get(0).size()==vec.size()){
                    ans.add(vec);
                }
            }
            for (int i = 0; i < word.length(); i++) {
                for (char c = 'a'; c <= 'z'; c++) {
                    char[] replacedCharArray = word.toCharArray();
                    replacedCharArray[i] = c;
                    String replacedWord = new String(replacedCharArray);
                    if (hs.contains(replacedWord)) {
                        vec.add(replacedWord);
                        ArrayList < String > temp = new ArrayList < > (vec);
                        q.add(temp);
                        usedOnLevel.add(replacedWord);
                        vec.remove(vec.size() - 1);
                    }
                }

            }
        }
        return ans;

    }
    public static void main(String[] args) {
        String startWord = "der", targetWord = "dfs";
        String[] wordList = {
                "des",
                "der",
                "dfr",
                "dgt",
                "dfs"
        };
        System.out.println(findLadders(startWord,targetWord, Arrays.asList(wordList)));
    }
}
