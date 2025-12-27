package com.collection.list;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSearch1st {
    public static void main(String[] args) {

        ArrayList<Character> al=new ArrayList<>();
        al.add('R');
        al.add('N');
        al.add('H');
        al.add('Z');
        al.add('A');
        System.out.println("Before sorting "+al);
        Collections.sort(al);
        System.out.println("After sorting "+al);
        System.out.println(Collections.binarySearch(al,'H'));
        System.out.println(Collections.binarySearch(al,'N'));
        System.out.println(Collections.binarySearch(al,'M'));
    }
}
