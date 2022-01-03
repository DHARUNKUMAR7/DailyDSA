package com.company;
import java.util.*;

 class ANAGRAM {
    public static void main(String[] args) {
        String[] str=new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa","aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"};
        groupAnagrams(str);

    }
     public List<List<String>> groupAnagrams(String[] strs) {
         int[] arr=new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};



         Map<String,List<String>> map=  new HashMap<>();
         for (int i = 0; i < strs.length; i++) {
             char[] c = strs[i].toCharArray();
             Arrays.sort(c);
             String d=new String(c);
             if(map.containsKey(d)){
                 map.get(d).add(strs[i]);
             }
             else{
                 map.put(d,new ArrayList<>());
                 map.get(d).add(strs[i]);
             }
         }
         List<List<String>> res=new ArrayList<List<String>>();
         for(List<String> i: map.values()){
             res.add(i);
         }
         return res;


     }

}
