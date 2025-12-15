package com.collection.list;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsReverse1st {
    public static void main(String[] args) {

        ArrayList<Integer> al=new ArrayList<>();
        al.add(8);
        al.add(43);
        al.add(23);
        al.add(33);
        al.add(4);
        System.out.println("Before reverse "+al);
        Collections.reverse(al);
        System.out.println("After reverse "+al);
    }
}
