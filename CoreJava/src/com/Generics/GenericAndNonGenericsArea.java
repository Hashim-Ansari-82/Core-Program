<<<<<<< HEAD
package com.generics;
=======
package com.Generics;
>>>>>>> f3e1def09101a6122c098c4ca4c25b0cf7fc45bf

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
