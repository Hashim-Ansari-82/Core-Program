package com.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsDemo2nd {
    public static void main(String[] args) {

        ArrayList<Character> al=new ArrayList<>();
        al.add('H');
        al.add('R');
        al.add('N');
        al.add('Z');
        al.add('A');
        System.out.println("Before sorting "+al);
        Collections.sort(al,new MyComparator1());
        System.out.println("After sorting "+al);
    }
}
class MyComparator1 implements Comparator<Character> {

    public int compare(Character c1,Character c2){

        return c2.compareTo((c1));
    }
}