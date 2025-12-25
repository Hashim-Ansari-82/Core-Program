package com.objectclassmethod;

import java.lang.reflect.Method;

public class AllMethodInObjectClass {

    public static void main(String[] args)throws Exception {
        int count=0;
        Class c=Class.forName("java.lang.Object");
        Method[] a= c.getDeclaredMethods();
        for(Method m:a){
            System.out.println(m.getName());
            ++count;
        }
        System.out.println("Total Method in Object Class "+count);
    }
}
