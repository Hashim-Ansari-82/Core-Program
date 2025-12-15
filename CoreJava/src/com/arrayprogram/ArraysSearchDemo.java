package com.arrayprogram;

import java.util.*;
import static java.util.Arrays.binarySearch;

public class ArraysSearchDemo {
    public static void main(String[] args) {

        int[] a = {12, 3, 43, 4, 2, 32, 23, 3, 43, 4, 56, 67, 76, 6};
        Arrays.sort(a);
        for(int i:a) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println(binarySearch(a, 43));
        System.out.println(binarySearch(a, 56));

        String[] s = {"A", "H", "U", "K","N"};
        Arrays.sort(s);
        for(String s1:s){
            System.out.print(s1+" ");
        }
        System.out.println();
        System.out.println(binarySearch(s,"H"));
        System.out.println(binarySearch(s,"N"));

        Arrays.sort(s,new ComparatorDemo1());
        for(String s1:s){
            System.out.print(s1+" ");
        }
        System.out.println();
        System.out.println(binarySearch(s,"H",new ComparatorDemo1()));
        System.out.println(binarySearch(s,"N",new ComparatorDemo1()));
    }
}
class ComparatorDemo1 implements Comparator{

    public int compare(Object o1,Object o2){
        String s1=o1.toString();
        String s2=o2.toString();
        return s2.compareTo(s1);
    }
}