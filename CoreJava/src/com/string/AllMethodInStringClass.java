package com.string;

import java.lang.reflect.*;

public class AllMethodInStringClass {
    public static void main(String[] args) throws Throwable {
        int count=0;
        Class c=Class.forName("java.lang.String");
        Method[] m=c.getDeclaredMethods();
        for(Method m1:m){
            System.out.println(m1.getName());
            ++count;
        }
        System.out.println("Total Method in String Class "+count);
    }
}
