package com.string;

public class CharPrint {
    public static void main(String[] args) {
        String s="swiss";
        for(int i=0; i<s.length(); i++){
           char c=s.charAt(i);
           if(c=='w') {
               System.out.println(c);
               break;
           }
        }
    }
}
