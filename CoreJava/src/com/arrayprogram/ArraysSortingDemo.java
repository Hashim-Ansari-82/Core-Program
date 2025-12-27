package com.arrayprogram;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSortingDemo {
    public static void main(String[] args) {

        int[] a={12,43,54,5,54,5,3,4,3,2,32,3};
        System.out.println("\n<---Primitive Before Sorting---->\n");
        for(int i:a){
            System.out.print(i+" ");
        }
        Arrays.sort(a);
        System.out.println();
        System.out.println("\n<---Primitive After Sorting--->\n");
        for(int i:a) {
            System.out.print(i+" ");
        }
        String[] s={"H","N","J","Z","R"};
        System.out.println();
        System.out.println("\n<---Object Before Sorting--->\n");
        for(String s1:s){
            System.out.print(s1+" ");
        }
        Arrays.sort(s);
        System.out.println();
        System.out.println("\n<---Object Before Sorting--->\n");
        for(String s1:s){
            System.out.print(s1+" ");
        }
        Arrays.sort(s,new ComparatorDemo());
        System.out.println();
        System.out.println("\n<---Object Sorting By Comparator--->\n");
        for(String s1:s){
            System.out.print(s1+" ");
        }
    }
}
class ComparatorDemo implements Comparator{

    public int compare(Object o1,Object o2){
        String s=o1.toString();
        String s1=o2.toString();
        return s1.compareTo(s);
    }
}
