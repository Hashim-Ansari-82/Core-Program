package com.collection.list;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsSearch2nd {
    public static void main(String[] args) {

        ArrayList<Integer> al=new ArrayList<>();
        al.add(12);
        al.add(34);
        al.add(23);
        al.add(45);
        al.add(24);
        System.out.println("Before sorting "+al);
        Collections.sort(al,new MyComparator2nd());
        System.out.println("After sorting "+al);
        System.out.println(Collections.binarySearch(al,23,new MyComparator2nd()));
        System.out.println(Collections.binarySearch(al,45,new MyComparator2nd()));
        System.out.println(Collections.binarySearch(al,50,new MyComparator2nd()));
    }
}
class MyComparator2nd implements Comparator<Integer>{

    public int compare(Integer c1,Integer c2){
        return c2.compareTo(c1);
    }
}