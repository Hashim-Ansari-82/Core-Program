
package com.generics;

import java.util.ArrayList;

public class GenericAndNonGenericsArea {

    public static void main(String[] args) {

        ArrayList<String> al=new ArrayList<>();
        al.add("Hashim");
        al.add("143");
        al.add("Rani");
        show(al);
        System.out.println(al);

    }
    public static void show(ArrayList al){

        al.add(29);
        al.add('N');
        al.add(true);
        al.add(14.5);

    }
}
