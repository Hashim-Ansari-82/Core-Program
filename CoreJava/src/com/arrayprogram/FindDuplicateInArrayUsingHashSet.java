package com.arrayprogram;

import java.util.HashSet;

public class FindDuplicateInArrayUsingHashSet {
    public static void main(String[] args) {
        int[] a={2,3,4,5,3,4,4,3,3,3};
        HashSet<Integer> h=new HashSet<>();
        for(int i:a){
            if(!h.add(i)){
                System.out.println("Duplicate Element : "+i);
            }
        }
    }
}
