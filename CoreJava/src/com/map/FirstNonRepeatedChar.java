package com.map;

import java.util.*;

public class FirstNonRepeatedChar {
    public static void main(String[] args) {
        String str="Hashim Rani";
        String str1=str.toUpperCase();
        Map<Character,Integer> map=new LinkedHashMap<>();
        for(char c:str1.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
      for(Map.Entry<Character,Integer> entry:map.entrySet()){
          if(entry.getValue()==1){
              System.out.println("First non-Repeated char : "+entry.getKey());
              break;
          }
      }
    }

}
